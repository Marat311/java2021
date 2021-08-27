package day42_CustomClass_Constructors.scrumTask;

import day41CustomClass_Constructor.scrumTask.Developer;
import day41CustomClass_Constructor.scrumTask.ScrumTeam;
import day41CustomClass_Constructor.scrumTask.Tester;

public class CapitalOne {
    public static void main(String[] args) {
        ScrumTeam scrumTeam1 = new ScrumTeam("Zengin", "Engin", "Cengiz");
        scrumTeam1.hireTester(HumanResource.testersTeam1);
        scrumTeam1.hireDeveloper(HumanResource.devopsTeam1);

        ScrumTeam scrumTeam2 = new ScrumTeam("Selda", "Mucahit", "Dilem");
        scrumTeam2.hireTester(HumanResource.testersTeam2);
        scrumTeam2.hireDeveloper(HumanResource.devopsTeam2);

        ScrumTeam scrumTeam3 =new ScrumTeam("Mohigul","Maftuna","Zulkhumor");
        scrumTeam3.hireTester(HumanResource.testersTeam3);
        scrumTeam3.hireDeveloper(HumanResource.devopsTeam3);

        System.out.println(scrumTeam1);
        System.out.println(scrumTeam2);
        System.out.println(scrumTeam3);

        System.out.println("----------------------------------------");

        ScrumTeam[] scrums = {scrumTeam1, scrumTeam2, scrumTeam3};

        double budget =0;

        for(ScrumTeam eachTeam:scrums){

            for(Tester eachTester:eachTeam.testers){
                budget+=eachTester.salary;
            }

            for(Developer eachDev:eachTeam.devops){
                budget+=eachDev.salary;
            }

        }

        System.out.println("budget = " + budget);

        int totalDev = 0,
                totalTest=0;

        for(ScrumTeam eachTeam:scrums){
            totalTest+=eachTeam.testers.size();
           totalDev+=eachTeam.devops.size();
        }

        System.out.println(totalDev);
        System.out.println(totalTest);

        double maxSalaryTest = Double.MIN_VALUE;   //or  0  or //scrums[0].testers.get(0).salary;
        double minSalaryTest = Double.MAX_VALUE;

        String t1="", t2="", d1="", d2="";

        for (ScrumTeam eachTeam : scrums) {

            for (Tester eachTester : eachTeam.testers) {
                if(eachTester.salary > maxSalaryTest){
                    maxSalaryTest = eachTester.salary;
                    t1=eachTester.name;
                }

                if(eachTester.salary<minSalaryTest){
                    minSalaryTest = eachTester.salary;
                    t2=eachTester.name;
                }

            }

            for(Developer eachDev:eachTeam.devops){
            if(eachDev.salary>maxSalaryTest){
                maxSalaryTest=eachDev.salary;
                d1=eachDev.name;
            }

            if(eachDev.salary<minSalaryTest){
                minSalaryTest=eachDev.salary;
                d2=eachDev.name;
            }
            }

        }



    }

}

/*
        1. total budget
        2. total Number of testers in CapitalOne
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the testers
        5. what's the max & min salaries of the developers
 */
