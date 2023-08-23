package com.bekamdo;

public class Client {
    public static void main(String[] args)  throws  Exception{
        AnimalFactoryInterface animalFactory = new ConcreteFactory();
        AnimalInterface animal1 = animalFactory.getAnimalType("Tiger");
        animal1.Speak();

        AnimalInterface animal2 = animalFactory.getAnimalType("Duck");
        animal2.Speak();
        AnimalInterface animal3 = animalFactory.getAnimalType("Lion");
        animal3.Speak();



    }
}
