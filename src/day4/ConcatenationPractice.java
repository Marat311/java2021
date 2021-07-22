package day4;

public class ConcatenationPractice {

    public static void main(String[] args) {
        /*
        +:
        addition: when we have 2 numbers

        concatenation: when there is at least one string

        "10" +"10" = "1010"
        1+"10" = "110"
        "2"+3 = "23"


         */

        String word = "Java";
        System.out.println("My favorite language is "+word+ " programming language"); //concatenation

        System.out.println("-------------------------------");

        int dollars = 10000;
        double lira = dollars*8.41;
        double euro = dollars*0.9;


        System.out.println(dollars +" Us dollars equal to "+lira+" turkish lira");
        System.out.println(dollars + " US dollars equal to "+euro +" euros");

        System.out.println("________________");

        int a = 10;
        int b = 20;

        int addition = a+b;
        int subtraction =a-b;
        int multiplication = a*b;
//10+20=30
        System.out.println(a+"+"+b+"="+addition);

        //10-20=-10
        System.out.println(a+"-"+b+"="+subtraction);

        //10*20= 200
        System.out.println(a+"*"+b+"="+multiplication);

        String name = "Marina";
        String favoriteMusic = "Rock";
        String favoriteBook = "Titanic";
        String favoriteSeries = "GoT";
        System.out.println("\tHello my name is "+name+", my favorite music is \""+favoriteMusic+
                "\", my favorite book title is \""+favoriteBook+
                "\" my favorite TV series is \""+favoriteSeries+"\"");  // \" -it will be "

        System.out.println("===================");

        String today = "Monday";
        String todayClass = "Java";
        String tomorrow = "Tuesday";
        String tomorrowClass = "Selenium";

        System.out.println("Today is "+today+", today we have "+todayClass+" class");
        System.out.println("Tomorrow is "+tomorrow+", tomorrow we will have "+tomorrowClass+" class");

    }
}
