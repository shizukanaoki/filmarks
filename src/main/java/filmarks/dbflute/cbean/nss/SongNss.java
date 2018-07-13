package filmarks.dbflute.cbean.nss;

import filmarks.dbflute.cbean.cq.SongCQ;

/**
 * The nest select set-upper of SONG.
 * @author DBFlute(AutoGenerator)
 */
public class SongNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final SongCQ _query;
    public SongNss(SongCQ query) { _query = query; }
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
}
