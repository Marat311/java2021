package day9_IfStatements;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 9;

        if(number==1){
            System.out.println("Monday");
        }

        if(number==2){
            System.out.println("Tuesday");
        }
        if(number==3){
            System.out.println("Wednesday");
        }
        if(number==4){
            System.out.println("Tuesday");
        }
        if(number==5){
            System.out.println("Friday");
        }
        if(number==6){
            System.out.println("Saturday");
        }
        if(number==7){
            System.out.println("Sunday");
        }


        System.out.println("================");

        if(number==1){
            System.out.println("Monday");
        }

        if(number==2){
            System.out.println("Tuesday");
        } else if(number==3){
            System.out.println("Wednesday");
        }else if(number==4){
            System.out.println("Tuesday");
        }else if(number==5){
            System.out.println("Friday");
        }else if(number==6){
            System.out.println("Saturday");
        }else if (number==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Compiler error");
        }


    }

}
