package com.bekamdo;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Meal Pattern Demo****\n");
        Director director = new Director();

        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();

        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Costs " + vegMeal.);
    }
}
