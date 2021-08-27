package day39_CustomClass_Statics.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {


        Tester [] testers = {new Tester(), new Tester(), new Tester()};
        testers[0].setInfo(12345, 1300000, "Marina", "senior SDET");
        testers[1].setInfo(456, 1200000, "Elena", " SDET");
        testers[2].setInfo(789, 1100000, "Inna", "QA");

        ArrayList<Tester> testersList = new ArrayList<>();

        Developer [] devops = {new Developer(), new Developer(), new Developer()};
        devops[0].setInfo("Akbar", "SDET", 123, 130000);
        devops[1].setInfo("Muhtar", "SDET", 456, 100000);
        devops[2].setInfo("Asia", "QA", 789, 80000);

        ScrumTeam scrumTeam = new ScrumTeam();

        scrumTeam.setInfo("Leo", "Set", "Jhon", 3);
        scrumTeam.devopsList.addAll(Arrays.asList(devops));
        scrumTeam.testersList.addAll(Arrays.asList(testers));

        Tester tester = new Tester();
        tester.setInfo(12345, 1300000, "Kain", "senior SDET");
        scrumTeam.addTester(tester);

        scrumTeam.removeTester(456);
        System.out.println(scrumTeam);



    }
}
/*
create a class called MyScrumTeam:
                    1. create an array of Testers and add the testers from your group
                    2. create an array of developers add the developers from your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */