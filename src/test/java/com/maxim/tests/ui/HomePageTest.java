package com.maxim.tests.ui;

import com.maxim.framework.config.ConfigReader;
import com.maxim.framework.pages.AccountInformationPage;
import com.maxim.framework.pages.HomePage;
import com.maxim.framework.pages.SignupLoginPage;
import com.maxim.tests.base.BaseUiTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BaseUiTest {

    @Test
    void shouldOpenHomePage() {
        page.navigate(ConfigReader.get("base.url"));
        assertEquals("Automation Exercise", page.title());

        HomePage homePage = new HomePage(page);
        homePage.clickSignupLogin();
        SignupLoginPage signupLoginPage = new SignupLoginPage(page);

        assertEquals(
                ConfigReader.get("base.url") + "/login",
                page.url()
        );



        signupLoginPage.fillSignupForm("Raicov", "maxim@test.com");

        assertEquals(
                "Raicov",
                signupLoginPage.getSignupNameValue()
        );

        assertEquals(
                "maxim@test.com",
                signupLoginPage.getSignupEmailValue()
        );

        AccountInformationPage accountInformationPage =
                signupLoginPage.clickSignup();

        assertTrue(
                accountInformationPage.isAccountInformationVisible()
        );

    }
}
