package sqlframework.dbutils;

import sqlframework.dbconnect.DbConnect;
import aquality.selenium.core.logging.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbUtils {

    public static List<Map<String, Object>> executeSqlQuery(String selectQuerySQL) throws SQLException, ClassNotFoundException {
        try (Connection connection = DbConnect.getDatabaseConnection()) {
            Logger.getInstance().info("Executing sql query");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectQuerySQL);
            ResultSetMetaData rs = result.getMetaData();
            int columns = rs.getColumnCount();
            List<Map<String, Object>> tableData = new ArrayList<>();
            while (result.next()) {
                HashMap<String, Object> row = new HashMap<String, Object>(columns);
                for (int i = 1; i <= columns; ++i) {
                    row.put(rs.getColumnLabel(i), result.getObject(i));
                }
                tableData.add(row);
            }
            return tableData;
        } catch (SQLException e) {
            Logger.getInstance().error("JDBC driver not found: " + e);
            throw e;
        } catch (ClassNotFoundException e) {
            Logger.getInstance().error("SQL connection problem: " + e);
            throw e;
        }
    }
}
