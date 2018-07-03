package filmarks.dbflute.cbean.nss;

import filmarks.dbflute.cbean.cq.CommentCQ;

/**
 * The nest select set-upper of COMMENT.
 * @author DBFlute(AutoGenerator)
 */
public class CommentNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final CommentCQ _query;
    public CommentNss(CommentCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * ALBUM by my PRODUCT_ID, named 'album'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public AlbumNss withAlbum() {
        _query.xdoNss(() -> _query.queryAlbum());
        return new AlbumNss(_query.queryAlbum());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my USER_ID, named 'user'.
     */
    public void withUser() {
        _query.xdoNss(() -> _query.queryUser());
    }
}
