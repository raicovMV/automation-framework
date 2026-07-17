package com.maxim.framework.driver;

import com.maxim.framework.config.ConfigReader;
import com.maxim.framework.playwright.PlaywrightManager;

public final class BrowserManager {

    private final com.microsoft.playwright.Browser playwrightBrowser;
    private static BrowserManager instance;

    /*Логика здесь такая:
    PlaywrightManager → отдаёт Playwright /ConfigReader→ отдаёт выбранный browser и headless / BrowserFactory→ создаёт настоящий Playwright Browser
    /BrowserManager→ сохраняет его в поле browser    TODELETE*/
    private BrowserManager() {
        playwrightBrowser = BrowserFactory.create(
                PlaywrightManager.getInstance().getPlaywright(),
                ConfigReader.getBrowser(),
                ConfigReader.getBoolean("headless")
        );
    }

    public static BrowserManager getInstance() {
        if (instance == null) {
            instance = new BrowserManager();
        }

        return instance;
    }

    public com.microsoft.playwright.Browser getBrowser() {
        return playwrightBrowser;
    }

    public void close() {
        playwrightBrowser.close();
        instance = null;
    }
}