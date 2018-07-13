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
    /**
     * With nested relation columns to select clause. <br>
     * FAVORITE by my TARGET_ID, named 'favorite'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public FavoriteNss withFavorite() {
        _query.xdoNss(() -> _query.queryFavorite());
        return new FavoriteNss(_query.queryFavorite());
    }
    /**
     * With nested relation columns to select clause. <br>
     * COMMENT by my TARGET_ID, named 'comment'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public CommentNss withComment() {
        _query.xdoNss(() -> _query.queryComment());
        return new CommentNss(_query.queryComment());
    }
}
