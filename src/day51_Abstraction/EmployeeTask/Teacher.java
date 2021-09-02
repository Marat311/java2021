package day51_Abstraction.EmployeeTask;

public class Teacher extends Employee{

    public Teacher(String name, char gender, String jobTitle, double salary, long ID) {
        super("Teacher", gender, jobTitle, salary, ID);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working");
    }
}
