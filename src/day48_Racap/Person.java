package day48_Racap;

import java.time.LocalDate;

public class Person {
    private String name;
    private final char gender;
    private final int age;
    private final LocalDate DOB;

    public Person(String name, char gender, LocalDate dOB) {
        this.name = name;
        this.gender = gender;
        this.DOB = dOB;
        age = LocalDate.now().getYear()-this.DOB.getYear();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getdOB() {
        return DOB;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void eat(String s){
        System.out.println(name+ " is eating "+s);
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public void drink(String s){
        System.out.println(name+ " is drinking "+s);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + DOB + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
1. create a class named Person
        variables: name, gender, age, dateOfBirth
        methods: eat(), sleep(), drink()
 */