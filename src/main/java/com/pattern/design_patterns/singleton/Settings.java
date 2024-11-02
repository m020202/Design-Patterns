package com.pattern.design_patterns.singleton;

public class Settings {
    private static Settings INSTANCE = new Settings();
    private Settings() {}

    public static synchronized Settings getInstance() {
        return INSTANCE;
    }
}
