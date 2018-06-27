package filmarks.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import filmarks.dbflute.allcommon.DBMetaInstanceHandler;
import filmarks.dbflute.exentity.*;

/**
 * The entity of PRODUCT as TABLE. <br>
 * NEW_TABLE
 * <pre>
 * [primary-key]
 *     ID
 *
 * [column]
 *     ID, TITLE, PLAY_DATE, COUNTRY_OF_PRODUCTION, RUNNING_TIME, FILE_NAME
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
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer id = entity.getId();
 * String title = entity.getTitle();
 * java.time.LocalDate playDate = entity.getPlayDate();
 * String countryOfProduction = entity.getCountryOfProduction();
 * Integer runningTime = entity.getRunningTime();
 * String fileName = entity.getFileName();
 * entity.setId(id);
 * entity.setTitle(title);
 * entity.setPlayDate(playDate);
 * entity.setCountryOfProduction(countryOfProduction);
 * entity.setRunningTime(runningTime);
 * entity.setFileName(fileName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsProduct extends AbstractEntity implements DomainEntity {

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

    /** TITLE: {UQ, NotNull, VARCHAR(100)} */
    protected String _title;

    /** PLAY_DATE: {NotNull, DATE(10)} */
    protected java.time.LocalDate _playDate;

    /** COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)} */
    protected String _countryOfProduction;

    /** RUNNING_TIME: {NotNull, INT(10)} */
    protected Integer _runningTime;

    /** FILE_NAME: {NotNull, VARCHAR(200)} */
    protected String _fileName;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "PRODUCT";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param title : UQ, NotNull, VARCHAR(100). (NotNull)
     */
    public void uniqueBy(String title) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("title");
        setTitle(title);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsProduct) {
            BsProduct other = (BsProduct)obj;
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
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_title));
        sb.append(dm).append(xfND(_playDate));
        sb.append(dm).append(xfND(_countryOfProduction));
        sb.append(dm).append(xfND(_runningTime));
        sb.append(dm).append(xfND(_fileName));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public Product clone() {
        return (Product)super.clone();
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
     * [get] TITLE: {UQ, NotNull, VARCHAR(100)} <br>
     * ????
     * @return The value of the column 'TITLE'. (basically NotNull if selected: for the constraint)
     */
    public String getTitle() {
        checkSpecifiedProperty("title");
        return _title;
    }

    /**
     * [set] TITLE: {UQ, NotNull, VARCHAR(100)} <br>
     * ????
     * @param title The value of the column 'TITLE'. (basically NotNull if update: for the constraint)
     */
    public void setTitle(String title) {
        registerModifiedProperty("title");
        _title = title;
    }

    /**
     * [get] PLAY_DATE: {NotNull, DATE(10)} <br>
     * ???
     * @return The value of the column 'PLAY_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getPlayDate() {
        checkSpecifiedProperty("playDate");
        return _playDate;
    }

    /**
     * [set] PLAY_DATE: {NotNull, DATE(10)} <br>
     * ???
     * @param playDate The value of the column 'PLAY_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setPlayDate(java.time.LocalDate playDate) {
        registerModifiedProperty("playDate");
        _playDate = playDate;
    }

    /**
     * [get] COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)} <br>
     * ???
     * @return The value of the column 'COUNTRY_OF_PRODUCTION'. (basically NotNull if selected: for the constraint)
     */
    public String getCountryOfProduction() {
        checkSpecifiedProperty("countryOfProduction");
        return _countryOfProduction;
    }

    /**
     * [set] COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)} <br>
     * ???
     * @param countryOfProduction The value of the column 'COUNTRY_OF_PRODUCTION'. (basically NotNull if update: for the constraint)
     */
    public void setCountryOfProduction(String countryOfProduction) {
        registerModifiedProperty("countryOfProduction");
        _countryOfProduction = countryOfProduction;
    }

    /**
     * [get] RUNNING_TIME: {NotNull, INT(10)} <br>
     * ????
     * @return The value of the column 'RUNNING_TIME'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRunningTime() {
        checkSpecifiedProperty("runningTime");
        return _runningTime;
    }

    /**
     * [set] RUNNING_TIME: {NotNull, INT(10)} <br>
     * ????
     * @param runningTime The value of the column 'RUNNING_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setRunningTime(Integer runningTime) {
        registerModifiedProperty("runningTime");
        _runningTime = runningTime;
    }

    /**
     * [get] FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * ?????
     * @return The value of the column 'FILE_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getFileName() {
        checkSpecifiedProperty("fileName");
        return _fileName;
    }

    /**
     * [set] FILE_NAME: {NotNull, VARCHAR(200)} <br>
     * ?????
     * @param fileName The value of the column 'FILE_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setFileName(String fileName) {
        registerModifiedProperty("fileName");
        _fileName = fileName;
    }
}
