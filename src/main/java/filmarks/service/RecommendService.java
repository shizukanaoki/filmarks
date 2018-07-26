package filmarks.service;

import filmarks.dbflute.exentity.Artist;
import filmarks.dbflute.exentity.Favorite;
import filmarks.dbflute.exentity.User;
import filmarks.domain.ArtistRepository;
import filmarks.domain.FavoriteRepository;
import filmarks.domain.UserRepository;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RecommendService {

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Artist> findRecommendedArtists(User targetUser) {
        List<Favorite> targetUserFavorites = favoriteRepository.findByUserId(targetUser.getUserId());
        if (targetUserFavorites.size() < 10) {
            return Collections.EMPTY_LIST;
        }

        List<User> users = userRepository.findAll();

        List<Favorite> favorites = favoriteRepository.findAll();

        List<Integer> favoritedArtistIds = favorites.stream()
                .map(favorite -> favorite.getAlbum().get().getArtistId())
                .filter(artistId -> artistId != null)
                .distinct()
                .collect(Collectors.toList());

        if (favoritedArtistIds.isEmpty()) {
            return Collections.EMPTY_LIST;
        }

        List<Artist> artists = artistRepository.findByScope(favoritedArtistIds);

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

        List<Artist> sortedArtists = map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if (sortedArtists.size() < 10) {
            return Collections.EMPTY_LIST;
        } else if (sortedArtists.size() < 20) {
            return sortedArtists;
        } else {
            return sortedArtists.subList(0, 19);
        }
    }
}
