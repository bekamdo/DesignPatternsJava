package com.bekamdo;

public class Client {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern");

        System.out.println("\n Coloring Green");
        ColorInterface green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20,3);
    }
}
