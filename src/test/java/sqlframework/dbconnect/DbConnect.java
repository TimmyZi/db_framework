package sqlframework.dbconnect;

import aquality.selenium.core.logging.Logger;
import java.sql.*;
import static sqlframework.config.ConfigConstants.*;

public class DbConnect {

    public static Connection getDatabaseConnection() throws SQLException, ClassNotFoundException {
        Logger.getInstance().info("Database connection");
        String connectionStr = "jdbc:" + DATABASE_SYSTEM + "://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
        Class.forName(DB_DRIVER);
        return DriverManager.getConnection(connectionStr, DB_USER, DB_PASSWORD);
    }
}
