package filmarks.dbflute.cbean.nss;

import filmarks.dbflute.cbean.cq.AlbumCQ;

/**
 * The nest select set-upper of ALBUM.
 * @author DBFlute(AutoGenerator)
 */
public class AlbumNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final AlbumCQ _query;
    public AlbumNss(AlbumCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * ARTIST by my ARTIST_ID, named 'artist'.
     */
    public void withArtist() {
        _query.xdoNss(() -> _query.queryArtist());
    }
    /**
     * With nested relation columns to select clause. <br>
     * SONG by ID, named 'songAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SongNss withSongAsOne() {
        _query.xdoNss(() -> _query.querySongAsOne());
        return new SongNss(_query.querySongAsOne());
    }
}
