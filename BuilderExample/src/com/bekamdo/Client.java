package com.bekamdo;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new MotorCycle();

        //make a car
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        //make a motorcycle
        director.construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();

    }
}
