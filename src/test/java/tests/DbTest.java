package tests;

import sqlframework.config.ConfigManager;
import sqlframework.dbutils.DbUtils;
import org.testng.annotations.Test;
import unionreporting.DbData.DbData;

import java.sql.SQLException;

import static unionreporting.sqlqueries.SqlQueries.*;

public class DbTest {

    public static final String TEST_DATE = ConfigManager.getTestData().getValue("/testDate").toString();

    @Test
    public void dbTest() throws SQLException, ClassNotFoundException {
        //step 1
        DbData.getLogTestsData();
        //step 2
        DbData.getLogCountUniqueTests();
        //step 3
        DbData.getLogTestTableSortByDate(TEST_DATE);
        //step 4
        DbData.getLogTestCountByBrowser();
    }
}
