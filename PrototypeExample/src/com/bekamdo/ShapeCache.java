package com.bekamdo;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();
    public static  Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    public static void loadCache(){
        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);

    }
}
