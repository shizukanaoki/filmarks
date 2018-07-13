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
 * The abstract condition-query of POST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPostCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPostCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "POST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param postId The value of postId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPostId_Equal(Integer postId) {
        doSetPostId_Equal(postId);
    }

    protected void doSetPostId_Equal(Integer postId) {
        regPostId(CK_EQ, postId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param postId The value of postId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPostId_NotEqual(Integer postId) {
        doSetPostId_NotEqual(postId);
    }

    protected void doSetPostId_NotEqual(Integer postId) {
        regPostId(CK_NES, postId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param postId The value of postId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPostId_GreaterThan(Integer postId) {
        regPostId(CK_GT, postId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param postId The value of postId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPostId_LessThan(Integer postId) {
        regPostId(CK_LT, postId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param postId The value of postId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPostId_GreaterEqual(Integer postId) {
        regPostId(CK_GE, postId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param postId The value of postId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPostId_LessEqual(Integer postId) {
        regPostId(CK_LE, postId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of postId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of postId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPostId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPostId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param minNumber The min number of postId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of postId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPostId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePostId(), "POST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param postIdList The collection of postId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostId_InScope(Collection<Integer> postIdList) {
        doSetPostId_InScope(postIdList);
    }

    protected void doSetPostId_InScope(Collection<Integer> postIdList) {
        regINS(CK_INS, cTL(postIdList), xgetCValuePostId(), "POST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     * @param postIdList The collection of postId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostId_NotInScope(Collection<Integer> postIdList) {
        doSetPostId_NotInScope(postIdList);
    }

    protected void doSetPostId_NotInScope(Collection<Integer> postIdList) {
        regINS(CK_NINS, cTL(postIdList), xgetCValuePostId(), "POST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setPostId_IsNull() { regPostId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POST_ID: {PK, ID, NotNull, INT(10)}
     */
    public void setPostId_IsNotNull() { regPostId(CK_ISNN, DOBJ); }

    protected void regPostId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostId(), "POST_ID"); }
    protected abstract ConditionValue xgetCValuePostId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param targetId The value of targetId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_Equal(Integer targetId) {
        doSetTargetId_Equal(targetId);
    }

    protected void doSetTargetId_Equal(Integer targetId) {
        regTargetId(CK_EQ, targetId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param targetId The value of targetId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_NotEqual(Integer targetId) {
        doSetTargetId_NotEqual(targetId);
    }

    protected void doSetTargetId_NotEqual(Integer targetId) {
        regTargetId(CK_NES, targetId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param targetId The value of targetId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_GreaterThan(Integer targetId) {
        regTargetId(CK_GT, targetId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param targetId The value of targetId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_LessThan(Integer targetId) {
        regTargetId(CK_LT, targetId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param targetId The value of targetId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_GreaterEqual(Integer targetId) {
        regTargetId(CK_GE, targetId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param targetId The value of targetId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetId_LessEqual(Integer targetId) {
        regTargetId(CK_LE, targetId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param minNumber The min number of targetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of targetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTargetId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTargetId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param minNumber The min number of targetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of targetId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTargetId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTargetId(), "TARGET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param targetIdList The collection of targetId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetId_InScope(Collection<Integer> targetIdList) {
        doSetTargetId_InScope(targetIdList);
    }

    protected void doSetTargetId_InScope(Collection<Integer> targetIdList) {
        regINS(CK_INS, cTL(targetIdList), xgetCValueTargetId(), "TARGET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TARGET_ID: {UQ+, NotNull, INT(10)}
     * @param targetIdList The collection of targetId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetId_NotInScope(Collection<Integer> targetIdList) {
        doSetTargetId_NotInScope(targetIdList);
    }

    protected void doSetTargetId_NotInScope(Collection<Integer> targetIdList) {
        regINS(CK_NINS, cTL(targetIdList), xgetCValueTargetId(), "TARGET_ID");
    }

    protected void regTargetId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTargetId(), "TARGET_ID"); }
    protected abstract ConditionValue xgetCValueTargetId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param targetType The value of targetType as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetType_Equal(Integer targetType) {
        doSetTargetType_Equal(targetType);
    }

    protected void doSetTargetType_Equal(Integer targetType) {
        regTargetType(CK_EQ, targetType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param targetType The value of targetType as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetType_NotEqual(Integer targetType) {
        doSetTargetType_NotEqual(targetType);
    }

    protected void doSetTargetType_NotEqual(Integer targetType) {
        regTargetType(CK_NES, targetType);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param targetType The value of targetType as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetType_GreaterThan(Integer targetType) {
        regTargetType(CK_GT, targetType);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param targetType The value of targetType as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetType_LessThan(Integer targetType) {
        regTargetType(CK_LT, targetType);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param targetType The value of targetType as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetType_GreaterEqual(Integer targetType) {
        regTargetType(CK_GE, targetType);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param targetType The value of targetType as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTargetType_LessEqual(Integer targetType) {
        regTargetType(CK_LE, targetType);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param minNumber The min number of targetType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of targetType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTargetType_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTargetType_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param minNumber The min number of targetType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of targetType. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTargetType_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTargetType(), "TARGET_TYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param targetTypeList The collection of targetType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetType_InScope(Collection<Integer> targetTypeList) {
        doSetTargetType_InScope(targetTypeList);
    }

    protected void doSetTargetType_InScope(Collection<Integer> targetTypeList) {
        regINS(CK_INS, cTL(targetTypeList), xgetCValueTargetType(), "TARGET_TYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TARGET_TYPE: {+UQ, NotNull, INT(10)}
     * @param targetTypeList The collection of targetType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTargetType_NotInScope(Collection<Integer> targetTypeList) {
        doSetTargetType_NotInScope(targetTypeList);
    }

    protected void doSetTargetType_NotInScope(Collection<Integer> targetTypeList) {
        regINS(CK_NINS, cTL(targetTypeList), xgetCValueTargetType(), "TARGET_TYPE");
    }

    protected void regTargetType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTargetType(), "TARGET_TYPE"); }
    protected abstract ConditionValue xgetCValueTargetType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {IX, NotNull, INT(10), FK to USER}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_AT: {NotNull, DATETIME(19)}
     * @param createdAt The value of createdAt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_Equal(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_EQ,  createdAt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_AT: {NotNull, DATETIME(19)}
     * @param createdAt The value of createdAt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GT,  createdAt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_AT: {NotNull, DATETIME(19)}
     * @param createdAt The value of createdAt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessThan(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LT,  createdAt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_AT: {NotNull, DATETIME(19)}
     * @param createdAt The value of createdAt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_GreaterEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_GE,  createdAt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_AT: {NotNull, DATETIME(19)}
     * @param createdAt The value of createdAt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedAt_LessEqual(java.time.LocalDateTime createdAt) {
        regCreatedAt(CK_LE, createdAt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_AT: {NotNull, DATETIME(19)}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreatedAt_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CREATED_AT: {NotNull, DATETIME(19)}
     * <pre>e.g. setCreatedAt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdAt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreatedAt_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "CREATED_AT"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreatedAt(), nm, op);
    }

    protected void regCreatedAt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedAt(), "CREATED_AT"); }
    protected abstract ConditionValue xgetCValueCreatedAt();

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
    public HpSLCFunction<PostCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PostCB.class);
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
    public HpSLCFunction<PostCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PostCB.class);
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
    public HpSLCFunction<PostCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PostCB.class);
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
    public HpSLCFunction<PostCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PostCB.class);
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
    public HpSLCFunction<PostCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PostCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PostCB&gt;() {
     *     public void query(PostCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PostCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PostCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PostCQ sq);

    protected PostCB xcreateScalarConditionCB() {
        PostCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PostCB xcreateScalarConditionPartitionByCB() {
        PostCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PostCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCB cb = new PostCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "POST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PostCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PostCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PostCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCB cb = new PostCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "POST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PostCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PostCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PostCB cb = new PostCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PostCQ sq);

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
    protected PostCB newMyCB() {
        return new PostCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PostCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
