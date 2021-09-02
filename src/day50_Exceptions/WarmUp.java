package day50_Exceptions;

public class WarmUp {

    public static void main(String[] args) throws InterruptedException{


        for(int i = 1; i<=30; i++){
            System.out.println("Push-up "+i);

                Thread.sleep(2500);

        }

        System.out.println("----------------------------------");

        for(int i = 1; i<=20; i++){
            System.out.println("Pull-up "+i);

                Thread.sleep(3500);

        }
    }


    public static void pause(double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
/*
MorningWorkOut:
        1. Do 30 push-ups
                try pausing 2.5 seconds in each

        2. Do 20 Pull-ups
                try pausing 3.5 seconds in each

Rectangle task:
    private variables:
            length, width

    Encapsulate all the fields
            if the length/width of the rectangle is 0 or negative, throw an exception with a message of: "No Such a Rectangle with a length/width of: l/w "  replace l/w with given length/width

    Add a constructor to initialize all the fields

    methods:
        area(): returns the area of the rectangle
        perimeter(): returns the perimeter of the rectangle
        toString()
 */