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
 * The condition-query for in-line of FAVORITE.
 * @author DBFlute(AutoGenerator)
 */
public class FavoriteCIQ extends AbstractBsFavoriteCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsFavoriteCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public FavoriteCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsFavoriteCQ myCQ) {
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
    protected ConditionValue xgetCValueFavoriteId() { return _myCQ.xdfgetFavoriteId(); }
    public String keepFavoriteId_ExistsReferrer_PostList(PostCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepFavoriteId_NotExistsReferrer_PostList(PostCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepFavoriteId_SpecifyDerivedReferrer_PostList(PostCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepFavoriteId_QueryDerivedReferrer_PostList(PostCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepFavoriteId_QueryDerivedReferrer_PostListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    protected ConditionValue xgetCValueAlbumId() { return _myCQ.xdfgetAlbumId(); }
    protected ConditionValue xgetCValueFavoriteCreatedAt() { return _myCQ.xdfgetFavoriteCreatedAt(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(FavoriteCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(FavoriteCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(FavoriteCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(FavoriteCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return FavoriteCB.class.getName(); }
    protected String xinCQ() { return FavoriteCQ.class.getName(); }
}
