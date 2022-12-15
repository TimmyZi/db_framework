package sqlframework.config;

public class ConfigConstants {
    public static final String DATABASE_SYSTEM = ConfigManager.getConfig().getValue("/dbSystem").toString();
    public static final String DB_HOST = ConfigManager.getConfig().getValue("/dbHost").toString();
    public static final String DB_PORT = ConfigManager.getConfig().getValue("/dbPort").toString();
    public static final String DB_USER = ConfigManager.getConfig().getValue("/dbUser").toString();
    public static final String DB_PASSWORD = ConfigManager.getConfig().getValue("/dbPassword").toString();
    public static final String DB_NAME = ConfigManager.getConfig().getValue("/dbName").toString();
    public static final String DB_DRIVER = ConfigManager.getConfig().getValue("/dbDriver").toString();
}
