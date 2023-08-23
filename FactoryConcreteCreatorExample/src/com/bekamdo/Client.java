package com.bekamdo;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = new ShapeFactory().getShape("Circle");
        shape1.draw();
        Shape shape2 = new ShapeFactory().getShape("Rectangle");
        shape2.draw();
        Shape shape3 = new ShapeFactory().getShape("square");
        shape3.draw();
    }
}
