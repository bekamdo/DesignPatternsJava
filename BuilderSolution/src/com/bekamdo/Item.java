package com.bekamdo;

interface Item{
    public String name();
    public Packing packing();
    public float price();

}
abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;
}

class VegBurger extends  Burger{
    @Override
    public String name() {
        return "Veg com.bekamdo.Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken com.bekamdo.Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
abstract  class  ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;
}
class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "com.bekamdo.Pepsi";
    }

    @Override
    public float price() {
        return 1.50f;
    }

}
class Coke extends  ColdDrink{

    @Override
    public String name() {
        return "com.bekamdo.Coke";
    }

    @Override
    public float price() {
        return 75.50f;
    }

}
interface Packing{
    public String pack();
}
class Wrapper implements Packing{
    @Override
    public String pack() {
        return "com.bekamdo.Wrapper";
    }
}
class Bottle implements Packing{
    @Override
    public String pack() {
        return "com.bekamdo.Bottle";
    }
}