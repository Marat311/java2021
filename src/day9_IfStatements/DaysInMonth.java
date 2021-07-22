package day9_IfStatements;

public class DaysInMonth {

    public static void main(String[] args) {

        int month = 1;

        boolean has28Days = month==2;
        boolean has30Days = month==4 ||month==6||month==9||month==11;
        boolean has31Days = !has28Days && !has30Days;

        if(has28Days){
            System.out.println(" 28 days");
        }

        if(has30Days){
            System.out.println(" 30 days");
        }

        if(has31Days){
            System.out.println(" 31 days");
        }
    }
}
