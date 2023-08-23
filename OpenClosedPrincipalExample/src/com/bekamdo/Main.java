package com.bekamdo;

interface Shape{
    public double calculateArea();

}

public class Rectangle implements Shape {
   public double length;
   public double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Circle implements Shape{
    public double radius;
    public static final double PI = 3.142;

    @Override
    public double calculateArea() {
        return PI * (radius* radius);
    }
}

class AreaCalculator{
    public double calculateShapeArea(Shape shape){
        return shape.calculateArea();
    }

}