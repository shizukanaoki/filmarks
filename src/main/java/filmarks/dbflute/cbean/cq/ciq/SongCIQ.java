package filmarks.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import filmarks.dbflute.cbean.*;
import filmarks.dbflute.cbean.cq.bs.*;
import filmarks.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of SONG.
 * @author DBFlute(AutoGenerator)
 */
public class SongCIQ extends AbstractBsSongCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSongCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SongCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSongCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueSongId() { return _myCQ.xdfgetSongId(); }
    public String keepSongId_ExistsReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSongId_NotExistsReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSongId_SpecifyDerivedReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSongId_QueryDerivedReferrer_LyricsRecommendationList(LyricsRecommendationCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSongId_QueryDerivedReferrer_LyricsRecommendationListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueAlbumId() { return _myCQ.xdfgetAlbumId(); }
    protected ConditionValue xgetCValueSongTitle() { return _myCQ.xdfgetSongTitle(); }
    protected ConditionValue xgetCValueSongLyrics() { return _myCQ.xdfgetSongLyrics(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(SongCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SongCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SongCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SongCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SongCB.class.getName(); }
    protected String xinCQ() { return SongCQ.class.getName(); }
}
