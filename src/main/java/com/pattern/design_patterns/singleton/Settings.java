package com.pattern.design_patterns.singleton;

public class Settings {
    private Settings() {}

    private static class InstanceHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
