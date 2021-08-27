package day38CustomClass.employee;
/*
Employees:
    Attributes:
        employeeName, gender, SSN, employeeID, JobTitle, salaryCalc

    Actions:
        attendMeeting, Working, toString, SetInfo

    ArrayList of employees:
        1. remove all the employtees who are makeing lass than 100K
        2. remove all the QAs

 */
public class Employees {
    public String name;
    public char gender;
    public int Id;
    public String jobTitle;
    public double salary;

    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", Id=" + Id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaryCalc= $" + salary +
                '}';
    }

    public void setInfo(String name, char gender, int id, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        Id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;




    }
}
