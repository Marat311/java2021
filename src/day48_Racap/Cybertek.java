package day48_Racap;

import java.time.LocalDate;

public class Cybertek {

    public static void main(String[] args) {


        Tester tester = new Tester("Max", 'M', LocalDate.of(1995, 10, 24), 132, "SDET", 100000);
        tester.eat("Sandwich");
        tester.drink("Coffe");
        tester.sleep();
        tester.work();
        tester.attendMeeting();
        System.out.println(tester);
        System.out.println("--------------------------------");
        Developer developer = new Developer("Marina", 'f', LocalDate.of(1983, 11, 3), 456, "Dev", 150000);
       developer.eat("Burger");
       developer.drink("Coke");
       developer.sleep();
       developer.work();
       developer.attendMeeting();
        System.out.println(developer);
        System.out.println("---------------------------------");
        Teacher teacher = new Teacher("Muhtar", 'M', LocalDate.of(1984, 05,10), 789, "javateacher", 90000);
       teacher.eat("Pizza");
       teacher.drink("Juice");
       teacher.sleep();
       teacher.work();
       teacher.attendMeeting();
        System.out.println(teacher);
        System.out.println("-------------------------------");
        Student student = new Student("Alex", 'M', LocalDate.of(1996, 8, 6), "SybertekSchool", 1456);
        student.eat("Snacks");
        student.drink("Red bull");
        student.sleep();
        student.study();
        student.attendedClass();
        System.out.println(student);
    }

}
