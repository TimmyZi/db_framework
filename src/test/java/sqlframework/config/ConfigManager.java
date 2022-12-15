package sqlframework.config;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;

public class ConfigManager {
    private static final ISettingsFile CONFIG = new JsonSettingsFile("config.json");
    private static final ISettingsFile SQL_QUERY = new JsonSettingsFile("sqlQuery.json");
    private static final ISettingsFile TEST_DATA = new JsonSettingsFile("testData.json");

    public static ISettingsFile getConfig() {
        return CONFIG;
    }

    public static ISettingsFile getSqlQuery() {
        return SQL_QUERY;
    }

    public static ISettingsFile getTestData() {
        return TEST_DATA;
    }
}
