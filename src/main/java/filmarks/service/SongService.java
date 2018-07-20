package filmarks.service;

import filmarks.dbflute.exentity.Song;
import filmarks.domain.SongRepository;
import org.dbflute.exception.EntityAlreadyDeletedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    @Autowired
    SongRepository songRepository;

    public Song findOne(int songId) throws EntityAlreadyDeletedException {
        return songRepository.findOne(songId);
    }
}
