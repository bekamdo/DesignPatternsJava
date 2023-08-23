package com.bekamdo;

public class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    public void draw(){
        decoratedShape.draw();
    }
}
class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape decoratedShape){
        System.out.println("Border color Red");
    }



}
