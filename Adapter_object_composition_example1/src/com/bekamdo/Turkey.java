package com.bekamdo;

interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble  gobble");
    }

    @Override
    public void fly() {
        System.out.println("Iam flying a short distance");
    }
}
