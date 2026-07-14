package com.maxim.tests.smoke;

import com.maxim.framework.config.ConfigReader;
import com.maxim.framework.driver.BrowserFactory;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BrowserFactoryTest {

    @Test
    void shouldLaunchConfiguredBrowser() {

        try (Playwright playwright = Playwright.create()) {

            Browser browser = BrowserFactory.create(
                    playwright,
                    ConfigReader.getBrowser(),
                    ConfigReader.getBoolean("headless")
            );

            assertTrue(browser.isConnected());

            browser.close();
        }
    }
}
