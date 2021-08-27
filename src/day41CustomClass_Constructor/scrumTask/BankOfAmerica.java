package day41CustomClass_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Marina", 'F', "SDET", 123, 130000);
        Tester tester2 = new Tester("Abbos", 'M', "QA", 456, 100000);
        Tester tester3 = new Tester("TOm", 'M', "QA", 789, 90000);

        Tester tester4 = new Tester("Bot1", 'M', "QA", 1, 80000);
        Tester tester5 = new Tester("Bot2", 'M', "QA", 2, 85000);
        Tester tester6 = new Tester("Bot3", 'M', "QA", 3, 78000);
        Tester tester7 = new Tester("Bot4", 'M', "QA", 4, 94000);

        Tester tester8 = new Tester("Bot5", 'M', "QA", 5, 111000);
        Tester tester9 = new Tester("Bot6", 'F', "QA", 6, 109000);
        Tester tester10 = new Tester("Bot7", 'M', "QA", 7, 105000);

        Tester[] testers = {tester2, tester3};
        System.out.println(tester1);
        System.out.println(tester2);
        System.out.println(tester3);
        System.out.println(tester1.isEmployeed);
        System.out.println(tester2.isEmployeed);
        System.out.println(tester3.isEmployeed);

        Developer dev1 = new Developer("Tom", 'M', "developer", 123, 130000);
        Developer dev2 = new Developer("Max", 'M', "java developer", 456, 120000);
        Developer dev3 = new Developer("Mark", 'M', "software dev", 789, 100000);
        Developer dev4 = new Developer("Marina", 'F', "python dev", 741, 150000);

        Developer dev5 = new Developer("Marina", 'F', "python dev", 55, 160000);
        Developer dev6 = new Developer("Marina", 'F', "python dev", 66, 155000);
        Developer dev7 = new Developer("Marina", 'F', "python dev", 77, 144000);

        Developer dev8 = new Developer("Marina", 'F', "python dev", 88, 130000);
        Developer dev9 = new Developer("Marina", 'F', "python dev", 44, 120000);
        Developer dev10 = new Developer("Marina", 'F', "python dev", 22, 115000);

        Developer[] developers = {dev2, dev3, dev4};
        ScrumTeam scrum1 = new ScrumTeam("Philipp", "Atilla", "Vitaliy");
        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(developers);
        scrum1.hireTester(testers);

        System.out.println(scrum1);

        double budget = 0;

        for (Tester each : scrum1.testers) {
            budget += each.salary;
        }

        for (Developer each : scrum1.devops) {
            budget += each.salary;
        }
        System.out.println("budget scrum team1= " + budget);

        ScrumTeam scrum2 = new ScrumTeam("Jey", "Zee", "Beonce");
        Developer[] developers2 = {dev5, dev6, dev7};
        Tester[] testers2 = {tester4, tester5, tester6};
        scrum2.hireTester(testers2);
        scrum2.hireDeveloper(developers2);
        System.out.println(scrum2);

        double budget2 = 0;
        for (Tester each : scrum2.testers) {
            budget2 += each.salary;
        }

        for (Developer each : scrum2.devops) {
            budget2 += each.salary;
        }
        System.out.println("budget scrum team2= " + budget2);

        ScrumTeam scrum3 = new ScrumTeam("Peter", "Penn", "Jack");
        Developer[] developers3 = {dev8, dev9, dev10};

      //  Tester[] testers3 = {tester7, tester8, tester9, tester10};
        ArrayList<Tester> testers3 = new ArrayList<>(Arrays.asList(tester7, tester8, tester9, tester10));
        scrum3.hireTester(testers3);
        System.out.println("-------------------");
        System.out.println(scrum3);
        scrum3.hireDeveloper(developers3);

        ScrumTeam[] scrumTeams = {scrum1, scrum2, scrum3};
        System.out.println(scrum3);

        double budget3 = 0;
        for (Tester each : scrum3.testers) {
            budget3 += each.salary;
        }

        for (Developer each : scrum3.devops) {
            budget3 += each.salary;
        }
        System.out.println("budget scrum team3= " + budget3);
        double totalBudget = budget+budget2+budget3;
        System.out.println("totalBudget = " + totalBudget);



         int totalNumberTesters =0;
         double maxTesters = tester1.salary;
         double minTesters = tester1.salary;
         double budgetTesters = 0;

        int totalNUmberDev = 0;
        double maxDevops = dev1.salary;
        double minDevops = dev1.salary;
        double budgetDevops = 0;


       for (ScrumTeam eachScrum : scrumTeams) {
            for (Tester tester : eachScrum.testers) {
                budgetTesters+=tester.salary;
                totalNumberTesters ++;
                maxTesters = Math.max(tester.salary, maxTesters);
                minTesters = Math.min(tester.salary, minTesters);

            }
            for (Developer developer : eachScrum.devops) {
                budgetDevops+=developer.salary;
                totalNUmberDev++;
                maxDevops = Math.max(developer.salary, maxDevops);
                minDevops = Math.min(developer.salary, minDevops);

            }
        }
        System.out.println("-----------testers--------------");
        System.out.println("totalNumberTesters = " + totalNumberTesters);
        System.out.println("budgetTesters = " + budgetTesters);
        System.out.println("minTesters = " + minTesters);
        System.out.println("maxTesters = " + maxTesters);

        System.out.println("--------------devops----------------");
        System.out.println("totalNUmberDev = " + totalNUmberDev);
        System.out.println("budgetDevops = " + budgetDevops);
        System.out.println("minDevops = " + minDevops);
        System.out.println("maxDevops = " + maxDevops);
        System.out.println("total budget = " +(budgetTesters+budgetDevops));
        /*
        1. total budget
        2. total Number of testers in Bank of America
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the tester
        5. what's the max & min salaries of the developer
    */

    }
}