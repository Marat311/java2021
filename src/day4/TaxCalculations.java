package day4;

public class TaxCalculations {

    public static void main(String[] args) {


        int salary = 130000;
        double stateTax = 0.08;
        double federalTax = 0.21;

        double totalStateTax = salary*stateTax;
        double totalFederalTax = salary*federalTax;
        double salaryAfterTax = salary-totalFederalTax-totalStateTax;

        System.out.println("your salary is "+salary);

        //You need to pay totalStateTax to StateTax
        System.out.println("You need to pay "+totalStateTax+ " to state tax.");

        //You need to pay totalFederalTax to federalTax
        System.out.println("You need to pay "+totalFederalTax+ " to federal tax.");

        //Your take home salary is salary afterTax
        System.out.println("Salary after tax is "+salaryAfterTax);

    }
}
