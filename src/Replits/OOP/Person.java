package Replits.OOP;

public class Person {
    private String firstName, lastName;

    private int age;

    public Person(){
        firstName = "undefined";
        lastName = "undefined";
        age =-1;

    }
    public Person(String firstName, String lastName, int age){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return firstName+" | "+lastName+" | "+age;
    }



}
