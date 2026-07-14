package com.maxim.framework.driver;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public final class BrowserFactory {

    private BrowserFactory() {
    }

    public static com.microsoft.playwright.Browser create(
            Playwright playwright,
            SupportedBrowser supportedBrowser,
            boolean headless) {

        BrowserType.LaunchOptions launchOptions =
                new BrowserType.LaunchOptions().setHeadless(headless);

        return switch (supportedBrowser) {
            case CHROME -> playwright.chromium()
                    .launch(launchOptions.setChannel("chrome"));

            case EDGE -> playwright.chromium()
                    .launch(launchOptions.setChannel("msedge"));
        };
    }
}