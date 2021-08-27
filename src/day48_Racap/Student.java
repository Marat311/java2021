package day48_Racap;

import java.time.LocalDate;

public class Student extends Person{

    private String schoolName;
    private int id;

    public Student(String name, char gender, LocalDate dOB, String schoolName, int id) {
        super(name, gender, dOB);
        this.schoolName = schoolName;
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    public void attendedClass(){
        System.out.println(getName()+" is attended class");
    }
}
/*
 1. Student
                    variables: name, gender, age, dateOfBirth, schoolName, studentId

                    methods: study(), attendClass()

 */