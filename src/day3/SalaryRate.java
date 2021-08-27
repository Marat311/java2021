package day3;

public  class SalaryRate {


    public static void main(String[] args) {
//DataType variableName = Data;
        double HourlyRate = 85;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte WeeksInAYear = 48;

        //salaryCalc = hourlyRte * weeklyHours * 52
        double salary = HourlyRate * weeklyHours *WeeksInAYear; //total salaryCalc before tax

        //salaryTax = salaryCalc *stateTaxRate
        double stateTax = salary*stateTaxRate;

        //federalTax = salaryCalc * federalTaxRate
        double federalTax = salary* federalTaxRate;

        //totalTax = stateTax +federalTax
        double titalTax = stateTax+federalTax;
        //salaryAfterTax = salaryCalc -stateTax - federalTax ;
        double salaryAfterTax = salary - (stateTax + federalTax);

        System.out.println("9"+3); //93 concatenation
        System.out.println(9+3); // 12 addition

        System.out.println("Your salaryCalc is: $"+ salary+"$"); //163200
        System.out.println("State tax is: "+stateTax); //6528
        System.out.println("Federal Tax: "+federalTax); //35904
        System.out.println("Total Tax: "+(federalTax +stateTax)); //42432

        System.out.println("salaryCalc after Tax is: "+salaryAfterTax); //120768




    }

}
