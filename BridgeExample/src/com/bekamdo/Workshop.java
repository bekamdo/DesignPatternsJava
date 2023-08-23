package  com.bekamdo;

abstract class   Workshop{
    abstract public void work();

}
class Produce extends Workshop{
    @Override
    public void work() {
        System.out.println("produced");
    }
}

class Assemble extends Workshop{
    @Override
    public void work() {
        System.out.println("And assembled");

    }
}