package com.maxim.framework.playwright;

import com.microsoft.playwright.Page;

public final class PageManager {

    private final Page page;

    public PageManager(BrowserContextManager browserContextManager) {
        page = browserContextManager
                .getBrowserContext()
                .newPage();
    }
    public Page getPage() {
        return page;
    }

    public void close() {
        page.close();
    }
}