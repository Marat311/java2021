package day42_CustomClass_Constructors;

public class EmployeeObject {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Marina", "Sdet", 1, 150000);

        System.out.println(employee1);

        Employee employee2 = new Employee("Sabir");
        System.out.println(employee2);

        Employee employee3 = new Employee("Lale", "QA", 1);
        System.out.println(employee3);


    }
}