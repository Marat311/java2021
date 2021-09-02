package day51_Abstraction.EmployeeTask;

public class Tester extends Employee {

    public Tester(String name, char gender, String jobTitle, double salary, long ID){
        super("Tester", gender, jobTitle, salary, ID);
    }
    @Override
    public void work() {
        System.out.println("");
    }
}
