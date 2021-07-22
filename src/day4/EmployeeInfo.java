package day4;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Marina";
        String lastName = "Velitskaia";
        String fullName = firstName + " "+lastName;
        String companyName = "Apple";
        String jobTittle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = true;
        int salary = 150000;

        System.out.println("Employee full name : "+ fullName);

        String gender = "Female";
        System.out.println(fullName + " is " +gender); //concatenation- add some words use +
        //full name works at companyName

        System.out.println(fullName +" works at "+companyName);

        //fullName job title is ...
        System.out.println(fullName +" ' job title is "+jobTittle);

        System.out.println(fullName+ " is full name employee "+isFullTime);



    }
}
