package com.maxim.framework.playwright;

import com.microsoft.playwright.Playwright;


public final class PlaywrightManager {

    private static PlaywrightManager instance;

    private final Playwright playwright;

    private PlaywrightManager() {
        playwright = Playwright.create();
    }

    public static PlaywrightManager getInstance() {
        if (instance == null) {
            instance = new PlaywrightManager();
        }

        return instance;
    }

    public Playwright getPlaywright() {
        return playwright;
    }

    public void close() {
        playwright.close();
        instance = null;
    }
}