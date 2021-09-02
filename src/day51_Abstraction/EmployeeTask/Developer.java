package day51_Abstraction.EmployeeTask;

public class Developer extends Employee{
    public Developer(String name, char gender, String jobTitle, double salary, long ID) {
        super("Developer", gender, jobTitle, salary, ID);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working");
    }
}
