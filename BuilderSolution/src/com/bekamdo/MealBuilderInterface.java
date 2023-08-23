package com.bekamdo;

interface MealBuilderInterface {
    void buildBuurger();
    void buildDrink();

    Meal getMeal();
}

class VegMealBuilder implements  MealBuilderInterface {
    private Meal vegMeal = new Meal();

    @Override
    public void buildBuurger() {
        vegMeal.addItems(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.addItems(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }

}
class  NonVegMealBuilder implements  MealBuilderInterface{
    private Meal nonVegMeal = new Meal();
    @Override
    public void buildBuurger() {
      nonVegMeal.addItems(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
     nonVegMeal.addItems(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}
