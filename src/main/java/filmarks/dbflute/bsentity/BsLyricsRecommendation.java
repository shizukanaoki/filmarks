package filmarks.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import filmarks.dbflute.allcommon.DBMetaInstanceHandler;
import filmarks.dbflute.exentity.*;

/**
 * The entity of LYRICS_RECOMMENDATION as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     ID
 *
 * [column]
 *     ID, USER_ID, SONG_ID, LYRICS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     SONG, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     song, user
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * Integer userId = entity.getUserId();
 * Integer songId = entity.getSongId();
 * String lyrics = entity.getLyrics();
 * entity.setId(id);
 * entity.setUserId(userId);
 * entity.setSongId(songId);
 * entity.setLyrics(lyrics);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLyricsRecommendation extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, INT(10)} */
    protected Integer _id;

    /** USER_ID: {IX, NotNull, INT(10), FK to USER} */
    protected Integer _userId;

    /** SONG_ID: {IX, NotNull, INT(10), FK to SONG} */
    protected Integer _songId;

    /** LYRICS: {NotNull, TEXT(65535)} */
    protected String _lyrics;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "LYRICS_RECOMMENDATION";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** SONG by my SONG_ID, named 'song'. */
    protected OptionalEntity<Song> _song;

    /**
     * [get] SONG by my SONG_ID, named 'song'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'song'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Song> getSong() {
        if (_song == null) { _song = OptionalEntity.relationEmpty(this, "song"); }
        return _song;
    }

    /**
     * [set] SONG by my SONG_ID, named 'song'.
     * @param song The entity of foreign property 'song'. (NullAllowed)
     */
    public void setSong(OptionalEntity<Song> song) {
        _song = song;
    }

    /** USER by my USER_ID, named 'user'. */
    protected OptionalEntity<User> _user;

    /**
     * [get] USER by my USER_ID, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] USER by my USER_ID, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<User> user) {
        _user = user;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsLyricsRecommendation) {
            BsLyricsRecommendation other = (BsLyricsRecommendation)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_song != null && _song.isPresent())
        { sb.append(li).append(xbRDS(_song, "song")); }
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_songId));
        sb.append(dm).append(xfND(_lyrics));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_song != null && _song.isPresent())
        { sb.append(dm).append("song"); }
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public LyricsRecommendation clone() {
        return (LyricsRecommendation)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, INT(10)} <br>
     * ID
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] USER_ID: {IX, NotNull, INT(10), FK to USER} <br>
     * ????ID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, NotNull, INT(10), FK to USER} <br>
     * ????ID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] SONG_ID: {IX, NotNull, INT(10), FK to SONG} <br>
     * ID
     * @return The value of the column 'SONG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Integer getSongId() {
        checkSpecifiedProperty("songId");
        return _songId;
    }

    /**
     * [set] SONG_ID: {IX, NotNull, INT(10), FK to SONG} <br>
     * ID
     * @param songId The value of the column 'SONG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSongId(Integer songId) {
        registerModifiedProperty("songId");
        _songId = songId;
    }

    /**
     * [get] LYRICS: {NotNull, TEXT(65535)} <br>
     * ??
     * @return The value of the column 'LYRICS'. (basically NotNull if selected: for the constraint)
     */
    public String getLyrics() {
        checkSpecifiedProperty("lyrics");
        return _lyrics;
    }

    /**
     * [set] LYRICS: {NotNull, TEXT(65535)} <br>
     * ??
     * @param lyrics The value of the column 'LYRICS'. (basically NotNull if update: for the constraint)
     */
    public void setLyrics(String lyrics) {
        registerModifiedProperty("lyrics");
        _lyrics = lyrics;
    }
}
