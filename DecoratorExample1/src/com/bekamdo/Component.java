package com.bekamdo;

abstract class Component {
    public abstract void doJob();
}
class ConcreteComponents extends  Component{
    @Override
    public void doJob() {
        System.out.println("Iam from a Concrete  Component iam closed for modification ");
    }
}
