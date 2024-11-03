package com.pattern.design_patterns.creational_patterns.factory_method.example;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("네모입니다.");
    }
}
