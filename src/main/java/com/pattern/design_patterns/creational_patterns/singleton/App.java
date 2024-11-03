package com.pattern.design_patterns.creational_patterns.singleton;

public class App {
    public static void main(String[] args) {
        Settings settings = Settings.INSTANCE;
        Settings settings1 = Settings.INSTANCE;

        System.out.println(settings1 == settings);
    }
}
