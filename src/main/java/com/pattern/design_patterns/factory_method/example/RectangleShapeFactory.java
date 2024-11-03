package com.pattern.design_patterns.factory_method.example;

public class RectangleShapeFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
