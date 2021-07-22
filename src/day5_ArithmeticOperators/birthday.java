package day5_ArithmeticOperators;

public class birthday {
    /*
    3. Create a class named BirthDay and create the following variable name,
    birthDay(int),
    birthMonth(String),
    birthYear(int)
    use concatenation to display the birthday of the person
    if  name = "John"
              birthDay = 25
                       birthMonth = "April"
                               birthYear = 1995;
         output:           John was born on
    */
    public static void main(String[] args) {


        String name = "John",
                birthMonth = "April";
        int birthDay = 25,
                birthYear = 1995;

        System.out.println(name+" was born on "+birthMonth+"/"+birthDay+"/"+birthYear);

        int age = 2021 - birthYear;
        System.out.println(name + " is "+age+" years old");




    }
}