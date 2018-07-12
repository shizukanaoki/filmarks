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
 * The condition-query for in-line of ALBUM.
 * @author DBFlute(AutoGenerator)
 */
public class AlbumCIQ extends AbstractBsAlbumCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsAlbumCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AlbumCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsAlbumCQ myCQ) {
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
    protected ConditionValue xgetCValueAlbumId() { return _myCQ.xdfgetAlbumId(); }
    public String keepAlbumId_ExistsReferrer_CommentList(CommentCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAlbumId_ExistsReferrer_FavoriteList(FavoriteCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAlbumId_ExistsReferrer_SongList(SongCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepAlbumId_NotExistsReferrer_CommentList(CommentCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAlbumId_NotExistsReferrer_FavoriteList(FavoriteCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAlbumId_NotExistsReferrer_SongList(SongCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepAlbumId_SpecifyDerivedReferrer_CommentList(CommentCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAlbumId_SpecifyDerivedReferrer_FavoriteList(FavoriteCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAlbumId_SpecifyDerivedReferrer_SongList(SongCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepAlbumId_QueryDerivedReferrer_CommentList(CommentCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAlbumId_QueryDerivedReferrer_CommentListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAlbumId_QueryDerivedReferrer_FavoriteList(FavoriteCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAlbumId_QueryDerivedReferrer_FavoriteListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAlbumId_QueryDerivedReferrer_SongList(SongCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepAlbumId_QueryDerivedReferrer_SongListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueAlbumTitle() { return _myCQ.xdfgetAlbumTitle(); }
    protected ConditionValue xgetCValueImageFileName() { return _myCQ.xdfgetImageFileName(); }
    protected ConditionValue xgetCValueArtistId() { return _myCQ.xdfgetArtistId(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(AlbumCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(AlbumCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(AlbumCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(AlbumCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return AlbumCB.class.getName(); }
    protected String xinCQ() { return AlbumCQ.class.getName(); }
}
