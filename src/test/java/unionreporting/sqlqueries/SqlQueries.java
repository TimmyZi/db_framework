package unionreporting.sqlqueries;

import sqlframework.config.ConfigManager;

public class SqlQueries {
    public static final String TESTS_INFO = ConfigManager.getSqlQuery().getValue("/testTableData").toString();
    public static final String COUNT_UNIQUE_TESTS = ConfigManager.getSqlQuery().getValue("/UniqueTestsCount").toString();
    public static final String TEST_TABLE_SORT_BY_DATE = ConfigManager.getSqlQuery().getValue("/testTableSortByDate").toString();
    public static final String TEST_COUNT_BY_BROWSER = ConfigManager.getSqlQuery().getValue("/testCountByBrowser").toString();
}
