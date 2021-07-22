package day7_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {
        String name1 = "Muhtar";
        String name2 = "Mehmet";

        String name3 = name2; //Mehmet
        name2=name1; //Muhtar
        name2 = name3; //Mehmet
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        int a = 200;
        System.out.println("a = " + a); //200
        int b = a;
        a = 100+300; //400
        System.out.println("a = " + a); //400

        String school = "Cybertek";
        school+=" School";
        System.out.println("school = " + school);

        String name = "John";
        String lastNmae = "Daniel";
        name +=" "+lastNmae;
        System.out.println("name = " + name);
        System.out.println("=====================");
        double salary = 130000;
        // *= multiplication
        salary*=0.8;
        System.out.println("salary = $" + salary);

        //0.65
        salary+=0.65;
        System.out.println("salary = " + salary);

        System.out.println("------------");
        // /= division

        double slices = 10; //10.0
        //slices /=0; exception cannot divide by 0 
        slices/=3;

        System.out.println("slices = " + slices); //3.333

        System.out.println("-----------");
        
        //%= reminder
        
        int cents = 105;
        int quarters = cents/25;
        cents %=25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-----------");

        /*
        reminder = numerator - (denominator * whole number of division result)

        10/3 ==> 3.333...
        reminder = 10-(3*3)=1
         */


    }
}
