package filmarks.dbflute.cbean.nss;

import filmarks.dbflute.cbean.cq.PostCQ;

/**
 * The nest select set-upper of POST.
 * @author DBFlute(AutoGenerator)
 */
public class PostNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PostCQ _query;
    public PostNss(PostCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * USER by my USER_ID, named 'user'.
     */
    public void withUser() {
        _query.xdoNss(() -> _query.queryUser());
    }
}
