package com.bekamdo;

class RealPrinter{
// the delegate
    void print(){
        System.out.println("The Delegate");
    }
}
class Printer{
    // The delegator
    RealPrinter p = new RealPrinter();

    //the delegate
    void print(){
        p.print(); //delegation
    }

}

class Tester {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print();

    }
}