package com.bekamdo;

class Director {
    MealBuilderInterface myBuilder;

    public void construct(MealBuilderInterface builder){
        myBuilder = builder;
        myBuilder.buildBuurger();
        myBuilder.buildDrink();

    }
}
