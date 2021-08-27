package day38CustomClass.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {

    public static void main(String[] args) {

        Employees employee1 = new Employees();
        employee1.setInfo("Marina", 'F', 001, "Senior SDET", 130000);

        System.out.println(employee1);
        employee1.salary = 150000;

        Employees employees2 = new Employees();
        employees2.setInfo("Abbos", 'M', 130, "SDET", 100000);
        System.out.println(employees2);

        Employees employees3 = new Employees();
        employees3.setInfo("Inna", 'F', 520, "QA", 90000);

        Employees employees4 = new Employees();
        employees4.setInfo("Elena", 'F', 430, "SDET", 110000);

        Employees employees5 = new Employees();
        employees5.setInfo("Sabir", 'M', 48, "QA Automation", 100000);

        ArrayList<Employees> empl = new ArrayList<>(Arrays.asList(employee1, employees2, employees3, employees4));
double sal=0;
        for(Employees each:empl){
sal+=each.salary;
            System.out.println(each.name+":"+each.salary);
        }
        System.out.println(sal);

        System.out.println("-------------------");

        ArrayList<Employees> names = new ArrayList<>(empl);
        names.removeIf(employee -> employee.salary>=130000 );

        for(Employees employees:names){
            System.out.println(employees);
        }



    }

}
