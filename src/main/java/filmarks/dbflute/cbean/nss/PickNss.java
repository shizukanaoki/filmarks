package filmarks.dbflute.cbean.nss;

import filmarks.dbflute.cbean.cq.PickCQ;

/**
 * The nest select set-upper of PICK.
 * @author DBFlute(AutoGenerator)
 */
public class PickNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PickCQ _query;
    public PickNss(PickCQ query) { _query = query; }
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
