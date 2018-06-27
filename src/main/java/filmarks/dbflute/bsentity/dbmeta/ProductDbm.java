package filmarks.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import filmarks.dbflute.allcommon.*;
import filmarks.dbflute.exentity.*;

/**
 * The DB meta of PRODUCT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ProductDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ProductDbm _instance = new ProductDbm();
    private ProductDbm() {}
    public static ProductDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Product)et).getId(), (et, vl) -> ((Product)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Product)et).getTitle(), (et, vl) -> ((Product)et).setTitle((String)vl), "title");
        setupEpg(_epgMap, et -> ((Product)et).getPlayDate(), (et, vl) -> ((Product)et).setPlayDate(ctld(vl)), "playDate");
        setupEpg(_epgMap, et -> ((Product)et).getCountryOfProduction(), (et, vl) -> ((Product)et).setCountryOfProduction((String)vl), "countryOfProduction");
        setupEpg(_epgMap, et -> ((Product)et).getRunningTime(), (et, vl) -> ((Product)et).setRunningTime(cti(vl)), "runningTime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "PRODUCT";
    protected final String _tableDispName = "PRODUCT";
    protected final String _tablePropertyName = "product";
    protected final TableSqlName _tableSqlName = new TableSqlName("PRODUCT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, Integer.class, "id", null, true, true, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTitle = cci("TITLE", "TITLE", null, null, String.class, "title", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlayDate = cci("PLAY_DATE", "PLAY_DATE", null, null, java.time.LocalDate.class, "playDate", null, false, false, true, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCountryOfProduction = cci("COUNTRY_OF_PRODUCTION", "COUNTRY_OF_PRODUCTION", null, null, String.class, "countryOfProduction", null, false, false, true, "VARCHAR", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRunningTime = cci("RUNNING_TIME", "RUNNING_TIME", null, null, Integer.class, "runningTime", null, false, false, true, "INT", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * ID: {PK, ID, NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * TITLE: {UQ, NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTitle() { return _columnTitle; }
    /**
     * PLAY_DATE: {NotNull, DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlayDate() { return _columnPlayDate; }
    /**
     * COUNTRY_OF_PRODUCTION: {NotNull, VARCHAR(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCountryOfProduction() { return _columnCountryOfProduction; }
    /**
     * RUNNING_TIME: {NotNull, INT(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRunningTime() { return _columnRunningTime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnTitle());
        ls.add(columnPlayDate());
        ls.add(columnCountryOfProduction());
        ls.add(columnRunningTime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnTitle()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "filmarks.dbflute.exentity.Product"; }
    public String getConditionBeanTypeName() { return "filmarks.dbflute.cbean.ProductCB"; }
    public String getBehaviorTypeName() { return "filmarks.dbflute.exbhv.ProductBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Product> getEntityType() { return Product.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Product newEntity() { return new Product(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Product)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Product)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
