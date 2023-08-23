package com.bekamdo;

public class Client {
    public static void main(String[] args) {
        ConcreteComponents cc = new ConcreteComponents();

        ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();


        cd_1.setComp(cc);
        cd_1.doJob();
        ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();
        cd_2.setComp(cd_1);
        cd_2.doJob();

    }
}
