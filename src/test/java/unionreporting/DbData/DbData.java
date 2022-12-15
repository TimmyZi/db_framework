package unionreporting.DbData;

import sqlframework.dbutils.DbUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static unionreporting.sqlqueries.SqlQueries.*;

public class DbData {

    public static void getLogTestsData() throws SQLException, ClassNotFoundException {
        getLog(DbUtils.executeSqlQuery(TESTS_INFO));
    }

    public static void getLogCountUniqueTests() throws SQLException, ClassNotFoundException {
        getLog(DbUtils.executeSqlQuery(COUNT_UNIQUE_TESTS));
    }

    public static void getLogTestTableSortByDate(String date) throws SQLException, ClassNotFoundException {
        getLog(DbUtils.executeSqlQuery(String.format(TEST_TABLE_SORT_BY_DATE, date)));
    }

    public static void getLogTestCountByBrowser() throws SQLException, ClassNotFoundException {
        getLog(DbUtils.executeSqlQuery(TEST_COUNT_BY_BROWSER));
    }

    private static void getLog(List<Map<String, Object>> list) {
        for (Map<String, Object> data : list) {
            System.out.println(data);
        }
    }
}
