package filmarks.dbflute.cbean.nss;

import filmarks.dbflute.cbean.cq.LyricsRecommendationCQ;

/**
 * The nest select set-upper of LYRICS_RECOMMENDATION.
 * @author DBFlute(AutoGenerator)
 */
public class LyricsRecommendationNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LyricsRecommendationCQ _query;
    public LyricsRecommendationNss(LyricsRecommendationCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * SONG by my SONG_ID, named 'song'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public SongNss withSong() {
        _query.xdoNss(() -> _query.querySong());
        return new SongNss(_query.querySong());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my USER_ID, named 'user'.
     */
    public void withUser() {
        _query.xdoNss(() -> _query.queryUser());
    }
}
