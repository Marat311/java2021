package day41CustomClass_Constructor.scrumTask;

public class Developer {
    public String name;
    public char gender;
    public String jobTitle;
    public int id;
    public double salary;

    public static boolean isEmployeed = false;
    public static boolean hatesTesters = true;
static {
    isEmployeed = true;
    hatesTesters = true;
}

    public Developer(String name, char gender, String jobTitle, int id, double salary) {
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                '}';
    }
}
