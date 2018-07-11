package filmarks.service;

import filmarks.dbflute.exentity.Relationship;
import filmarks.domain.RelationShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationShipService {

    @Autowired
    private RelationShipRepository relationShipRepository;

    public Relationship create(Relationship relationship) {
        relationShipRepository.save(relationship);
        return relationship;
    }
}
