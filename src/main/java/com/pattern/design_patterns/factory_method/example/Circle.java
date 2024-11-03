package com.pattern.design_patterns.factory_method.example;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("동그라미입니다.");
    }
}
