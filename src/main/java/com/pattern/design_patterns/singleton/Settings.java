package com.pattern.design_patterns.singleton;

public class Settings {
    private static final Settings INSTANCE = new Settings();
    private Settings() {}

    public static Settings getInstance() {
        return INSTANCE;
    }
}
