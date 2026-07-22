package com.maxim.framework.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

    private final Page page;

    private final Locator signupLoginLink;
//    private final Locator enterAccountInformationTitle;

    public HomePage(Page page) {
        this.page = page;
        this.signupLoginLink = page.getByRole(
                AriaRole.LINK,
                new Page.GetByRoleOptions().setName("Signup / Login")
        );
    }
    public void clickSignupLogin() {
        signupLoginLink.click();
    }
}
