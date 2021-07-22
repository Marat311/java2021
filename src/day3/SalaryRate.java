package day3;

public  class SalaryRate {


    public static void main(String[] args) {
//DataType variableName = Data;
        double HourlyRate = 85;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte WeeksInAYear = 48;

        //salary = hourlyRte * weeklyHours * 52
        double salary = HourlyRate * weeklyHours *WeeksInAYear; //total salary before tax

        //salaryTax = salary *stateTaxRate
        double stateTax = salary*stateTaxRate;

        //federalTax = salary * federalTaxRate
        double federalTax = salary* federalTaxRate;

        //totalTax = stateTax +federalTax
        double titalTax = stateTax+federalTax;
        //salaryAfterTax = salary -stateTax - federalTax ;
        double salaryAfterTax = salary - (stateTax + federalTax);

        System.out.println("9"+3); //93 concatenation
        System.out.println(9+3); // 12 addition

        System.out.println("Your salary is: $"+ salary+"$");
        System.out.println("State tax is: "+stateTax);
        System.out.println("Federal Tax: "+federalTax);
        System.out.println("Total Tax: "+(federalTax +stateTax));

        System.out.println("Salary after Tax is: "+salaryAfterTax);




    }

}
