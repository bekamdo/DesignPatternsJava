package com.bekamdo;

 abstract class Shape {
     protected  ColorInterface color;

     protected Shape(ColorInterface color) {
         this.color = color;
     }
     abstract  void drawShape(int border);
     abstract  void modifyBorder(int border,int increment);
 }

 class Triangle extends  Shape{
     public Triangle(ColorInterface color) {
         super(color);
     }

     @Override
     void drawShape(int border) {
         System.out.println("This traingle is colored with ");
         color.fillWithColor(border);
     }

     @Override
     void modifyBorder(int border, int increment) {
         System.out.println("\n Now we are changing the border length " + increment + " times");
         border = border * increment;
         drawShape(border);
     }
 }

class Triangle extends  Shape{
    public Triangle(ColorInterface color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This Rectangle is colored with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\n Now we are changing the border length " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}
