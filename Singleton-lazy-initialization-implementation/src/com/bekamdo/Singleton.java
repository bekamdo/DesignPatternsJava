package com.bekamdo;

public class Singleton {
    //private reference to the one and only instance

    // an instance attribute
    private int data = 0;

    private Singleton(){}
    private static  class SingletonHelper{
        //nested class is referenced after the get instance is called
        private static final Singleton uniqueInstance = new Singleton();


    }

    public  static   Singleton getInstance(){

        return SingletonHelper.uniqueInstance;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}