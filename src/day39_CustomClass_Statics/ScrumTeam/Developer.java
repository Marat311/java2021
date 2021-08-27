package day39_CustomClass_Statics.ScrumTeam;

public class Developer {
    public String name, JobTitle;
    public int employeeID, salary;

    public void setInfo(String name, String jobTitle, int employeeID, int salary) {
        this.name = name;
        JobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void coding(){
        System.out.println(name+ " is coding");
    }

    public void unitTesting(){
        System.out.println(name+ " is do Unit testing");
    }

    public void fixingBug(){
        System.out.println(name+ " is fixing the bug");
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
