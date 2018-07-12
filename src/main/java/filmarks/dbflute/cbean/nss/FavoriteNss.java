package filmarks.dbflute.cbean.nss;

import filmarks.dbflute.cbean.cq.FavoriteCQ;

/**
 * The nest select set-upper of FAVORITE.
 * @author DBFlute(AutoGenerator)
 */
public class FavoriteNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final FavoriteCQ _query;
    public FavoriteNss(FavoriteCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * ALBUM by my ALBUM_ID, named 'album'.
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
