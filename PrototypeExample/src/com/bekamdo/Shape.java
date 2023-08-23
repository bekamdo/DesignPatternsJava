package com.bekamdo;

abstract  class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    private String getType(){
        return  type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle draw() method");
    }
}
class Square extends Shape{
    public Square(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Square draw() method");
    }
}