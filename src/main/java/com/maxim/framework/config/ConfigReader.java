package com.maxim.framework.config;
/* ConfigReader = Simple access for frameworkConfigManager
Its responsibility:
To provide a simple interface to the entire Framework.
Other classes should never know that ConfigManager exists.
They simply write:
String url = ConfigReader.get("base.url");
and that's it.
In other words, ConfigReader is a Facade (a simplified interface) over ConfigManager. */

import com.maxim.framework.driver.SupportedBrowser;

public final class ConfigReader {

    private ConfigReader() {
    }

    public static String get(String key) {
        return ConfigManager.getInstance().get(key);
    }

    public static int getInt(String key) {
        return Integer.parseInt(get(key));
    }

    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(get(key));
    }

    public static SupportedBrowser getBrowser() { String browser = get("browser"); return SupportedBrowser.valueOf(browser.toUpperCase()); }
}