package com.maxim.framework.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class AccountInformationPage {

    // Dependencies
    private final Page page;
    // Dependencies
    private final Locator accountInformationTitle;

    // Constructor
    public AccountInformationPage(Page page) {
        this.page = page;
        this.accountInformationTitle = page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions()
                .setName("Enter Account Information"));
    }

    // Actions
    public boolean isAccountInformationVisible() {
        return accountInformationTitle.isVisible();
    }

}
