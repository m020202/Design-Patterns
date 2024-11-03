package com.pattern.design_patterns.creational_patterns.factory_method.example;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleShapeFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        System.out.println();

        ShapeFactory rectangleFactory = new RectangleShapeFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }
}
