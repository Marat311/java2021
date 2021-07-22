package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 8;
        String name="" ;
if(number>=1 && number<=7) {
    if (number == 1) {
        name = "Monday";
    } else if (number == 2) {
        name = "Tuesday";
    } else if (number == 3) {
        name = "Wednesday";
    } else if (number == 4) {
        name = "Thursday";
    } else if (number == 5) {
        name = "Friday";
    } else if (number == 6) {
        name = "Saturday";
    } else {
        name = "Sunday";
    }
}else{
    name += number+" Invalid day";
}
        System.out.println("name = " + name);

String name2 = (number>=1 && number<=7)?
        (number==1)?"Monday":
        (number==2)?"Tuesday":
        (number==3)?"Wednesday":
        (number==4)?"Thursday":
        (number==5)?"Friday":
        (number==6)?"Saturday":
        "Sunday":
                "Invalid day";
        System.out.println("name2 = " + name2);
    }
}
