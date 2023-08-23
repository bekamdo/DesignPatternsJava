package com.bekamdo;

interface Shape {
void draw();
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Shape: Rectangle");
    }
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Shape: Circle");
    }
}