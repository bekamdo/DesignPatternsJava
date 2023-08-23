package com.bekamdo;

interface HollyWoodMovieInterface {
    String getMovieName();

}

class HollyWoodActionMovie implements HollyWoodMovieInterface{
    @Override
    public String getMovieName() {
        return "True Lies is a hollywood movie action";
    }
}

class HollyWoodComedyMovie implements HollyWoodMovieInterface{
    @Override
    public String getMovieName() {
        return "The Jerk is a hollywood action movie";
    }
}