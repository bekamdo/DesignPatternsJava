package com.bekamdo;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        Supervisor technologyDean = new Supervisor("Dr Mike","Dean of Technology");
        Supervisor chairOfMathDepartment = new Supervisor("Dr John","Chair of the Math dept");
        Supervisor chairOfComputerScience = new Supervisor("Dr Ian","Chair of ComputerScience");

        Professor mathProf1 = new Professor("Math Professor1","Adjunct",302);
        Professor mathProf2 = new Professor("Math Professor2","Associate",303);

        Professor cseProf1 = new Professor("CSE Professor1","Adjunct",507);
        Professor cseProf2 = new Professor("CSE Professor2","Professor",508);
        Professor cseProf3 = new Professor("CSE Professor1","Professor",509);

        technologyDean.add(chairOfMathDepartment);
        technologyDean.add(chairOfComputerScience);

        chairOfMathDepartment.add(mathProf1);
        chairOfMathDepartment.add(mathProf2);

        chairOfComputerScience.add(cseProf1);
        chairOfComputerScience.add(cseProf2);
        chairOfComputerScience.add(cseProf3);

        System.out.println(technologyDean.getDetails());
        List<Faculty> chairs = technologyDean.getMyFacultyList();

        for (int i = 0; i < chairs.size(); i++){
            System.out.println(chairs.get(i).getDetails());
        }



    }
}
