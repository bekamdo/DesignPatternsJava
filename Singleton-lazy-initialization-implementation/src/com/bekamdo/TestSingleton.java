package com.bekamdo;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        // set the data value;
        s.setData(55);
        System.out.println("First Reference: " + s);
        System.out.println("Singleton value is " + s.getData());
    }
}
