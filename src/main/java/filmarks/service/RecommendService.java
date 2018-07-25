package filmarks.service;

import filmarks.dbflute.exbhv.ArtistBhv;
import filmarks.dbflute.exbhv.FavoriteBhv;
import filmarks.dbflute.exbhv.UserBhv;
import filmarks.dbflute.exentity.Artist;
import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.User;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RecommendService {

    @Autowired
    UserBhv userBhv;

    @Autowired
    ArtistBhv artistBhv;

    @Autowired
    FavoriteBhv favoriteBhv;

    public List<Artist> findRecommendedArtists(User targetUser) {
        ListResultBean<User> users = userBhv.selectList(userCB -> {
            userCB.query().addOrderBy_UserId_Asc();
        });

        userBhv.loadFavorite(users, refCB -> {
            refCB.setupSelect_Album();
        });

        ListResultBean<Favorite> favorites = favoriteBhv.selectList(favoriteCB -> {
            favoriteCB.setupSelect_Album();
        });

        List<Integer> favoritedArtistIds = favorites.stream()
                .map(favorite -> favorite.getAlbum().get().getArtistId())
                .distinct()
                .collect(Collectors.toList());

        if (favoritedArtistIds.isEmpty()) {
            return Collections.EMPTY_LIST;
        }

        ListResultBean<Artist> artists = artistBhv.selectList(artistCB -> {
            artistCB.query().addOrderBy_ArtistId_Asc();
            artistCB.query().setArtistId_InScope(favoritedArtistIds);
        });

        double[][] matrixData = new double[users.size()][artists.size()];
        double[][] targetUserFavoriteData = new double[1][artists.size()];

        for (int i = 0; i < users.size(); i++) {
            double[] userFavoriteData = new double[artists.size()];
            User user = users.get(i);
            List<Favorite> favoriteList = user.getFavoriteList();
            for (int j = 0; j < artists.size(); j++) {
                Artist artist = artists.get(j);
                double number_of_favorites = favoriteList.stream()
                        .map(favorite -> favorite.getAlbum().get().getArtistId())
                        .filter(artistId -> artistId.equals(artist.getArtistId()))
                        .count();
                userFavoriteData[j] = number_of_favorites;
            }
            if (user.equals(targetUser)) {
                targetUserFavoriteData[0] = userFavoriteData;
            }
            matrixData[i] = userFavoriteData;
        }

        RealMatrix corrMatrix = new PearsonsCorrelation().computeCorrelationMatrix(matrixData);
        RealMatrix userFavoriteMatrix = MatrixUtils.createRealMatrix(targetUserFavoriteData);
        RealMatrix scores = userFavoriteMatrix.multiply(corrMatrix);

        Map<Artist, Double> map = new HashMap<>();
        for (int k = 0; k < artists.size(); k++) {
            map.put(artists.get(k), scores.getEntry(0, k));
        }

        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
