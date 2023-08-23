package com.bekamdo;

public class FactoryProducer {
    public static  MovieFactoryInterface getFactory(String choice){
        if(choice.equalsIgnoreCase("COMEDY")){
            return new ComedyMovieFactory();
        } else if (choice.equalsIgnoreCase("ACTION")) {
            return  new ActionMovieFactory();

        }
        return  null;

    }
}
