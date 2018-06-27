package filmarks.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import filmarks.dbflute.allcommon.*;
import filmarks.dbflute.cbean.*;
import filmarks.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "PRODUCT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ID: {PK, ID, NotNull, INT(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "ID"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_Equal(String title) {
        doSetTitle_Equal(fRES(title));
    }

    protected void doSetTitle_Equal(String title) {
        regTitle(CK_EQ, title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotEqual(String title) {
        doSetTitle_NotEqual(fRES(title));
    }

    protected void doSetTitle_NotEqual(String title) {
        regTitle(CK_NES, title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterThan(String title) {
        regTitle(CK_GT, fRES(title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessThan(String title) {
        regTitle(CK_LT, fRES(title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_GreaterEqual(String title) {
        regTitle(CK_GE, fRES(title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_LessEqual(String title) {
        regTitle(CK_LE, fRES(title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param titleList The collection of title as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_InScope(Collection<String> titleList) {
        doSetTitle_InScope(titleList);
    }

    protected void doSetTitle_InScope(Collection<String> titleList) {
        regINS(CK_INS, cTL(titleList), xgetCValueTitle(), "TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param titleList The collection of title as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTitle_NotInScope(Collection<String> titleList) {
        doSetTitle_NotInScope(titleList);
    }

    protected void doSetTitle_NotInScope(Collection<String> titleList) {
        regINS(CK_NINS, cTL(titleList), xgetCValueTitle(), "TITLE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_LikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_LikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setTitle_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param title The value of title as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTitle_LikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(title), xgetCValueTitle(), "TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTitle_NotLikeSearch(String title, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTitle_NotLikeSearch(title, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @param title The value of title as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTitle_NotLikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(title), xgetCValueTitle(), "TITLE", likeSearchOption);
    }

    protected void regTitle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTitle(), "TITLE"); }
    protected abstract ConditionValue xgetCValueTitle();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAY_DATE: {NotNull, DATE(10)}
     * @param playDate The value of playDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayDate_Equal(java.time.LocalDate playDate) {
        regPlayDate(CK_EQ,  playDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAY_DATE: {NotNull, DATE(10)}
     * @param playDate The value of playDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayDate_GreaterThan(java.time.LocalDate playDate) {
        regPlayDate(CK_GT,  playDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAY_DATE: {NotNull, DATE(10)}
     * @param playDate The value of playDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayDate_LessThan(java.time.LocalDate playDate) {
        regPlayDate(CK_LT,  playDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAY_DATE: {NotNull, DATE(10)}
     * @param playDate The value of playDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayDate_GreaterEqual(java.time.LocalDate playDate) {
        regPlayDate(CK_GE,  playDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLAY_DATE: {NotNull, DATE(10)}
     * @param playDate The value of playDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlayDate_LessEqual(java.time.LocalDate playDate) {
        regPlayDate(CK_LE, playDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLAY_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setPlayDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of playDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of playDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setPlayDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setPlayDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLAY_DATE: {NotNull, DATE(10)}
     * <pre>e.g. setPlayDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of playDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of playDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setPlayDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "PLAY_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValuePlayDate(), nm, op);
    }

    protected void regPlayDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlayDate(), "PLAY_DATE"); }
    protected abstract ConditionValue xgetCValuePlayDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProduction The value of countryOfProduction as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryOfProduction_Equal(String countryOfProduction) {
        doSetCountryOfProduction_Equal(fRES(countryOfProduction));
    }

    protected void doSetCountryOfProduction_Equal(String countryOfProduction) {
        regCountryOfProduction(CK_EQ, countryOfProduction);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProduction The value of countryOfProduction as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryOfProduction_NotEqual(String countryOfProduction) {
        doSetCountryOfProduction_NotEqual(fRES(countryOfProduction));
    }

    protected void doSetCountryOfProduction_NotEqual(String countryOfProduction) {
        regCountryOfProduction(CK_NES, countryOfProduction);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProduction The value of countryOfProduction as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryOfProduction_GreaterThan(String countryOfProduction) {
        regCountryOfProduction(CK_GT, fRES(countryOfProduction));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProduction The value of countryOfProduction as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryOfProduction_LessThan(String countryOfProduction) {
        regCountryOfProduction(CK_LT, fRES(countryOfProduction));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProduction The value of countryOfProduction as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryOfProduction_GreaterEqual(String countryOfProduction) {
        regCountryOfProduction(CK_GE, fRES(countryOfProduction));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProduction The value of countryOfProduction as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryOfProduction_LessEqual(String countryOfProduction) {
        regCountryOfProduction(CK_LE, fRES(countryOfProduction));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProductionList The collection of countryOfProduction as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryOfProduction_InScope(Collection<String> countryOfProductionList) {
        doSetCountryOfProduction_InScope(countryOfProductionList);
    }

    protected void doSetCountryOfProduction_InScope(Collection<String> countryOfProductionList) {
        regINS(CK_INS, cTL(countryOfProductionList), xgetCValueCountryOfProduction(), "COUNTRY_OF_PRODUCTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProductionList The collection of countryOfProduction as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountryOfProduction_NotInScope(Collection<String> countryOfProductionList) {
        doSetCountryOfProduction_NotInScope(countryOfProductionList);
    }

    protected void doSetCountryOfProduction_NotInScope(Collection<String> countryOfProductionList) {
        regINS(CK_NINS, cTL(countryOfProductionList), xgetCValueCountryOfProduction(), "COUNTRY_OF_PRODUCTION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCountryOfProduction_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param countryOfProduction The value of countryOfProduction as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCountryOfProduction_LikeSearch(String countryOfProduction, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCountryOfProduction_LikeSearch(countryOfProduction, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setCountryOfProduction_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param countryOfProduction The value of countryOfProduction as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCountryOfProduction_LikeSearch(String countryOfProduction, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(countryOfProduction), xgetCValueCountryOfProduction(), "COUNTRY_OF_PRODUCTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProduction The value of countryOfProduction as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCountryOfProduction_NotLikeSearch(String countryOfProduction, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCountryOfProduction_NotLikeSearch(countryOfProduction, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @param countryOfProduction The value of countryOfProduction as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCountryOfProduction_NotLikeSearch(String countryOfProduction, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(countryOfProduction), xgetCValueCountryOfProduction(), "COUNTRY_OF_PRODUCTION", likeSearchOption);
    }

    protected void regCountryOfProduction(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountryOfProduction(), "COUNTRY_OF_PRODUCTION"); }
    protected abstract ConditionValue xgetCValueCountryOfProduction();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param runningTime The value of runningTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunningTime_Equal(Integer runningTime) {
        doSetRunningTime_Equal(runningTime);
    }

    protected void doSetRunningTime_Equal(Integer runningTime) {
        regRunningTime(CK_EQ, runningTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param runningTime The value of runningTime as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunningTime_NotEqual(Integer runningTime) {
        doSetRunningTime_NotEqual(runningTime);
    }

    protected void doSetRunningTime_NotEqual(Integer runningTime) {
        regRunningTime(CK_NES, runningTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param runningTime The value of runningTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunningTime_GreaterThan(Integer runningTime) {
        regRunningTime(CK_GT, runningTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param runningTime The value of runningTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunningTime_LessThan(Integer runningTime) {
        regRunningTime(CK_LT, runningTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param runningTime The value of runningTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunningTime_GreaterEqual(Integer runningTime) {
        regRunningTime(CK_GE, runningTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param runningTime The value of runningTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRunningTime_LessEqual(Integer runningTime) {
        regRunningTime(CK_LE, runningTime);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param minNumber The min number of runningTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of runningTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setRunningTime_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setRunningTime_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param minNumber The min number of runningTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of runningTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setRunningTime_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRunningTime(), "RUNNING_TIME", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param runningTimeList The collection of runningTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRunningTime_InScope(Collection<Integer> runningTimeList) {
        doSetRunningTime_InScope(runningTimeList);
    }

    protected void doSetRunningTime_InScope(Collection<Integer> runningTimeList) {
        regINS(CK_INS, cTL(runningTimeList), xgetCValueRunningTime(), "RUNNING_TIME");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RUNNING_TIME: {NotNull, INT(10)}
     * @param runningTimeList The collection of runningTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRunningTime_NotInScope(Collection<Integer> runningTimeList) {
        doSetRunningTime_NotInScope(runningTimeList);
    }

    protected void doSetRunningTime_NotInScope(Collection<Integer> runningTimeList) {
        regINS(CK_NINS, cTL(runningTimeList), xgetCValueRunningTime(), "RUNNING_TIME");
    }

    protected void regRunningTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRunningTime(), "RUNNING_TIME"); }
    protected abstract ConditionValue xgetCValueRunningTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_Equal(String fileName) {
        doSetFileName_Equal(fRES(fileName));
    }

    protected void doSetFileName_Equal(String fileName) {
        regFileName(CK_EQ, fileName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_NotEqual(String fileName) {
        doSetFileName_NotEqual(fRES(fileName));
    }

    protected void doSetFileName_NotEqual(String fileName) {
        regFileName(CK_NES, fileName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_GreaterThan(String fileName) {
        regFileName(CK_GT, fRES(fileName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_LessThan(String fileName) {
        regFileName(CK_LT, fRES(fileName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_GreaterEqual(String fileName) {
        regFileName(CK_GE, fRES(fileName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_LessEqual(String fileName) {
        regFileName(CK_LE, fRES(fileName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileNameList The collection of fileName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_InScope(Collection<String> fileNameList) {
        doSetFileName_InScope(fileNameList);
    }

    protected void doSetFileName_InScope(Collection<String> fileNameList) {
        regINS(CK_INS, cTL(fileNameList), xgetCValueFileName(), "FILE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileNameList The collection of fileName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFileName_NotInScope(Collection<String> fileNameList) {
        doSetFileName_NotInScope(fileNameList);
    }

    protected void doSetFileName_NotInScope(Collection<String> fileNameList) {
        regINS(CK_NINS, cTL(fileNameList), xgetCValueFileName(), "FILE_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setFileName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fileName The value of fileName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFileName_LikeSearch(String fileName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFileName_LikeSearch(fileName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setFileName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fileName The value of fileName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFileName_LikeSearch(String fileName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fileName), xgetCValueFileName(), "FILE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFileName_NotLikeSearch(String fileName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFileName_NotLikeSearch(fileName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FILE_NAME: {NotNull, VARCHAR(200)}
     * @param fileName The value of fileName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFileName_NotLikeSearch(String fileName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fileName), xgetCValueFileName(), "FILE_NAME", likeSearchOption);
    }

    protected void regFileName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFileName(), "FILE_NAME"); }
    protected abstract ConditionValue xgetCValueFileName();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ProductCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ProductCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ProductCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ProductCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ProductCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ProductCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ProductCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ProductCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ProductCB&gt;() {
     *     public void query(ProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ProductCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ProductCQ sq);

    protected ProductCB xcreateScalarConditionCB() {
        ProductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ProductCB xcreateScalarConditionPartitionByCB() {
        ProductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ProductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ProductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ProductCB cb = new ProductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ProductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ProductCB cb = new ProductCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ProductCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected ProductCB newMyCB() {
        return new ProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
