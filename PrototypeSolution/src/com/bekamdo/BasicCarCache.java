package com.bekamdo;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String,BasicCar> basicCarMap = new Hashtable<String,BasicCar>();
    public static BasicCar getCar(String carName){
        BasicCar cachedBasicCar = basicCarMap.get(carName);
        return (BasicCar) cachedBasicCar.clone();

    }
    public static  void loadCache(){
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price = 100000;
        basicCarMap.put("Green nano", nano_base);

        BasicCar ford_basic = new Nano("Ford Yellow");
        nano_base.price = 500000;
        basicCarMap.put("Ford Yellow", nano_base);
    }
}
