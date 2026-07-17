package com.maxim.tests.smoke;

import com.maxim.tests.base.BaseUiTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BrowserFactoryTest extends BaseUiTest {

    @Test
    void shouldLaunchConfiguredBrowser() {
        assertTrue(browserManager.getBrowser().isConnected());
    }


}
