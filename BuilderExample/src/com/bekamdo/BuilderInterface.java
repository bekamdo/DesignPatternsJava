package com.bekamdo;

interface BuilderInterface{
    void buildBody();
    void insertWheels();
    void addHeadlights();

    Product getVehicle();
}
class Car implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
       product.add("4 wheels were added");
    }

    @Override
    public void addHeadlights() {
      product.add("2 headlights were added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
class MotorCycle implements BuilderInterface{
    private Product product = new Product();
    @Override
    public void buildBody() {
        System.out.println("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        System.out.println("Two wheels were added");
    }

    @Override
    public void addHeadlights() {
        System.out.println("One headlight was added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}