package day10_NestedIf;

public class SalaryAfterTax {
    public static void main(String[] args) {

        double salary = 100_000;

        double taxRate = 0;

        if(salary>=130000){
            taxRate=0.035;
        }else if(salary>=100000){
            taxRate=0.30;
        }else if(salary>=80000){
            taxRate=0.25;
        }else{
            taxRate=0.20;
        }

        boolean isMarried=false;

        if(isMarried){
            taxRate-=0.05;
        }

        double salaryAfterTax = salary-(salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);


    }
}
