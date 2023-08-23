package com.bekamdo;

public class Client {
    public static void main(String[] args) {
        MovieFactoryInterface actionMovies = FactoryProducer.getFactory("action");
        HollyWoodMovieInterface hAction = actionMovies.GetHollyWoodMovie();
        BollyWoodMovieInterface bAction = actionMovies.GetBollyWoodMovie();

        System.out.println("Action movies are");
        System.out.println(hAction.getMovieName());
        System.out.println(bAction.getMovieName());

        MovieFactoryInterface comedyMovies = FactoryProducer.getFactory("comedy");
        HollyWoodMovieInterface hComedy = comedyMovies.GetHollyWoodMovie();
        BollyWoodMovieInterface bComedy = comedyMovies.GetBollyWoodMovie();

        System.out.println("Comedy movies are");
        System.out.println(hComedy.getMovieName());
        System.out.println(bComedy.getMovieName());
    }




}

