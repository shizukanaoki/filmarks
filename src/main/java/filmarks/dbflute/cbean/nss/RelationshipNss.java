package filmarks.dbflute.cbean.nss;

import filmarks.dbflute.cbean.cq.RelationshipCQ;

/**
 * The nest select set-upper of RELATIONSHIP.
 * @author DBFlute(AutoGenerator)
 */
public class RelationshipNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RelationshipCQ _query;
    public RelationshipNss(RelationshipCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * USER by my FOLLOWER_ID, named 'userByFollowerId'.
     */
    public void withUserByFollowerId() {
        _query.xdoNss(() -> _query.queryUserByFollowerId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my FOLLOWING_ID, named 'userByFollowingId'.
     */
    public void withUserByFollowingId() {
        _query.xdoNss(() -> _query.queryUserByFollowingId());
    }
}
