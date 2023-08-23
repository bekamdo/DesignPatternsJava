package com.bekamdo;

abstract class AbstractDecorator extends Component {
    protected Component com;

    public void setComp(Component c) {
        com = c;
    }

    public void doJob(){
        if(com != null){
            com.doJob();

        }
    }
}

class  ConcreteDecoratorEx_1 extends AbstractDecorator{
    @Override
    public void doJob() {
        super.doJob();
        System.out.println("Iam explicity from concrete decorator 1");
    }


}
class  ConcreteDecoratorEx_2 extends AbstractDecorator{
    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("**Start Example-2 **");
        super.doJob();

        System.out.println("Explicitly from DecoratorEx_2");
        System.out.println("***End EX2 ***");
    }
}
