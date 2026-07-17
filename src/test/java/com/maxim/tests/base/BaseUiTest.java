package com.maxim.tests.base;

import com.maxim.framework.driver.BrowserManager;
import com.maxim.framework.playwright.BrowserContextManager;
import com.maxim.framework.playwright.PageManager;
import com.maxim.framework.playwright.PlaywrightManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseUiTest {

    protected BrowserManager browserManager;
    protected BrowserContextManager browserContextManager;
    protected PageManager pageManager;

    @BeforeEach
    void setUp() {
        browserManager = BrowserManager.getInstance();

        browserContextManager = new BrowserContextManager();
        pageManager = new PageManager(browserContextManager);
    }

    @AfterEach
    void tearDown() {
        pageManager.close();
        browserContextManager.close();
        BrowserManager.getInstance().close();
        PlaywrightManager.getInstance().close();
    }


}
