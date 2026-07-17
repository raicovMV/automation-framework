package com.maxim.framework.playwright;

import com.maxim.framework.driver.BrowserManager;
import com.microsoft.playwright.BrowserContext;

public final class BrowserContextManager {

    private final BrowserContext browserContext;

    public BrowserContextManager() {
        browserContext =
                BrowserManager.getInstance()
                        .getBrowser()
                        .newContext();
    }

    public BrowserContext getBrowserContext() {
        return browserContext;
    }

    public void close() {
        browserContext.close();
    }
}
