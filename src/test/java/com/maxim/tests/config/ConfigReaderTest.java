package com.maxim.tests.config;

import com.maxim.framework.config.ConfigReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConfigReaderTest {

    @Test
    void shouldReadBaseUrl() {

        final String baseUrl = ConfigReader.get("base.url"); // final (because we don't change these variables anywhere else.)

        assertNotNull(baseUrl);
        assertFalse(baseUrl.isBlank());
        assertTrue(baseUrl.startsWith("https://"));
    }

    @Test
    void shouldReadEnvironment() {

        String environment = ConfigReader.get("environment");

        assertNotNull(environment);
        assertFalse(environment.isBlank());
    }

    @Test
    void shouldReadDefaultTimeout() {

        final int timeout = ConfigReader.getInt("default.timeout"); // final (because we don't change these variables anywhere else.)

        assertTrue(timeout > 0);
        //assertTrue(timeout < 60);
    }

    @Test
    void shouldReadHeadless() {

        boolean headless = ConfigReader.getBoolean("headless");

        assertFalse(headless);
    }

}