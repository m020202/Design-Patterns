package com.pattern.design_patterns.singleton;

public class RuntimeEx {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
    }
}
