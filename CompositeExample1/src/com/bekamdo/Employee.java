package com.bekamdo;

interface Employee {
    public void showEmployeeDetails();
}

class Developer implements  Employee{

    private long empID;
    private String name;
    private String position;

    public Developer( long empID,String name, String position) {
        this.name = name;
        this.empID = empID;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empID + " " + name + " " + position);
    }
}

class Manager implements  Employee{
    private long empID;
    private String name;
    private String position;

    public Manager(long empID,String name, String position) {
        this.name = name;
        this.empID = empID;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empID + " " + name + " " + position);
    }
}

