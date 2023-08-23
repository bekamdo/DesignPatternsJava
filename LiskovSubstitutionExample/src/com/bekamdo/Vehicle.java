package com.bekamdo;

public abstract class Vehicle {
  abstract int getSpeed();
  abstract int getCubicCapacity();
}

public class Car extends Vehicle{
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }
}