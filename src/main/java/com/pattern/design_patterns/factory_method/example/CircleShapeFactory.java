package com.pattern.design_patterns.factory_method.example;

public class CircleShapeFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
