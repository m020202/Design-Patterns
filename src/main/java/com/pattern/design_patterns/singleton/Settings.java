package com.pattern.design_patterns.singleton;

import org.mockito.internal.matchers.Null;

public class Settings {
    private static Settings instance;
    private Settings() {}

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }
}
