package day40CustomClass_Statics;

import day38CustomClass.employee.Employees;

public class HumanResource {

    public static Employees employee1 = new Employees();
    public static Employees employee2 = new Employees();
    public static Employees employee3 = new Employees();
    public static Employees employee4 = new Employees();
    public static Employees employee5 = new Employees();

    static {
        employee1.setInfo("Ahmet",'M', 1, "SDET", 100000);
        employee2.setInfo("Marina", 'F', 2, "Senior SDET", 150000);
        employee3.setInfo("Elena", 'F', 3, "QA Automation", 95000);
        employee4.setInfo("Inna", 'F', 4,"QA",  90000);
        employee5.setInfo("Sabir", 'M', 5, "Scrum Master", 110000);
    }

 /*   public static void main(String[] args) {
        employee1.setInfo("Ahmet",'M', 1, "SDET", 100000);
    }

*/

}
