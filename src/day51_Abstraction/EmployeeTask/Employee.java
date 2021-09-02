package day51_Abstraction.EmployeeTask;

public abstract class Employee {
    private String name;
    private char gender;
    private String jobTitle;
    private double salary;
    private long ID;

    public Employee(String name, char gender, String jobTitle, double salary, long ID) {
        setName(name);
        setGender(gender);
        setJobTitle(jobTitle);
        setSalary(salary);
        setID(ID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", ID=" + ID +
                '}';
    }
}
/*
Employee: Encapsulation, Inheritance, Abstraction, overriding, class & object, constructors

Employee:
		name, gender, jobTitle, salary, id
		work();
 */