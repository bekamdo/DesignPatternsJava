package com.bekamdo;

interface MovieFactoryInterface {
    HollyWoodMovieInterface GetHollyWoodMovie();
    BollyWoodMovieInterface GetBollyWoodMovie();
}

class ActionMovieFactory implements MovieFactoryInterface{
    @Override
    public HollyWoodMovieInterface GetHollyWoodMovie() {
        return new HollyWoodActionMovie();
    }

    @Override
    public BollyWoodMovieInterface GetBollyWoodMovie() {
        return new BollyWoodActionMovie();
    }
}
class ComedyMovieFactory implements MovieFactoryInterface{
    @Override
    public HollyWoodMovieInterface GetHollyWoodMovie() {
        return new HollyWoodComedyMovie();
    }

    @Override
    public BollyWoodMovieInterface GetBollyWoodMovie() {
        return new BollyWoodComedyMovie();
    }
}
