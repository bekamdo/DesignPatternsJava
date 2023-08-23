package com.bekamdo;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100,"Bekamdo","Pro developer");
        Employee dev2 = new Developer(101,"David","Entry Developer");

        Employee man1 = new Manager(200,"Jennifer","SEO Manager");
        Employee man2 = new Manager(201,"Ian","Myra's Manager");

        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Directory compDirectory = new Directory();
        compDirectory.addEmployee(engDirectory);
        compDirectory.addEmployee(accDirectory);

        compDirectory.showEmployeeDetails();
    }
}
