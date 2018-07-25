package filmarks.service;

import filmarks.dbflute.exentity.Album;
import filmarks.domain.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> findAlbums() {
        return albumRepository.findAlbums();
    }

    public Album findOne(int albumId) {
        return albumRepository.findOne(albumId);
    }

    public List<Album> findAlbumsByScope(List<Integer> ids) {
        return albumRepository.findByScope(ids);
    }
}
