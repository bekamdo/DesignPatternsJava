package com.bekamdo;

public class Main {
    public static void main(String[] args) {
        Captain team1 = Captain.getInstance();
        team1.setName("Ben");
        Captain team2  = Captain.getInstance();

        System.out.println(team2.getName());
    }
}