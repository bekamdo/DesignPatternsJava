package com.bekamdo;

public class Captain {
    private String name;

    private Captain(){

    }
    private static class CaptainHelper{
        private static final Captain captain = new Captain();
    }

    public static Captain getInstance(){
        return  CaptainHelper.captain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
