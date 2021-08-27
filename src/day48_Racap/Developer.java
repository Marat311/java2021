package day48_Racap;

import java.time.LocalDate;

public final class Developer extends Employee{

    public Developer(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is coding");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending scrum meeting");
    }
}
/*
 2. Developer
                    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

                    methods: work(), attendMeeting()
 */