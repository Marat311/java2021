package day51_Abstraction.EmployeeTask;

public class ScrumMaster extends Employee {

    public ScrumMaster(String name, char gender, String jobTitle, double salary, long ID) {
        super("Scrum Master", gender, jobTitle, salary, ID);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working");
    }
}
