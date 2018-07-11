package filmarks.domain;

import filmarks.dbflute.exbhv.RelationshipBhv;
import filmarks.dbflute.exentity.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RelationShipRepository {

    @Autowired
    private RelationshipBhv relationshipBhv;

    public Relationship save(Relationship relationship) {
        relationshipBhv.insert(relationship);
        return relationship;
    }
}
