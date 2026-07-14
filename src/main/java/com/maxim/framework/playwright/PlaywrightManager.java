package com.maxim.framework.playwright;

import com.microsoft.playwright.Playwright;


public final class PlaywrightManager {

    private static PlaywrightManager instance;

    private final Playwright playwright;

    private PlaywrightManager() {
        playwright = Playwright.create();
    }
}