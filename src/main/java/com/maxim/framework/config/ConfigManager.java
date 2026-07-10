package com.maxim.framework.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/* ConfigManager = Responsible for loading and storing config
Its responsibilities:
Load, store, and manage configuration.
This means it knows:
-which files to open;
-how to read them;
-where to store values;
-how to return a value by key.
That's why it's a Singleton. */

public class ConfigManager {

    private static ConfigManager instance;
    private final Properties properties = new Properties();

    private ConfigManager() {
        loadProperties();
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

    private void loadProperties() {
        loadFile("config/common.properties");
        loadFile("config/ui.properties");
        loadFile("config/api.properties");
        loadFile("config/playwright.properties");
    }

    private void loadFile(String filePath) {
        try (InputStream inputStream = getClass()
                .getClassLoader()
                .getResourceAsStream(filePath)) {

            if (inputStream == null) {
                throw new RuntimeException("Configuration file not found: " + filePath);
            }

            properties.load(inputStream);

        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file: " + filePath, e);
        }
    }
}
