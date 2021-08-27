package day38CustomClass.salary;

public class SalaryCalculator {

    public  double hourlyRate, stateTaxRate, federalTaxRate;
    public  int weeklyHours;

    public void salaryCalc(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHours = weeklyHours;
    }

    public double Salary(){

        return (hourlyRate*weeklyHours*52);
    }

    public double stateTax(){
        return  Salary()*stateTaxRate;
    }

    public double federalTax(){
        return  Salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return  Salary()-(stateTax()+federalTax());
    }

    public String toString() {
        return "salaryCalc{" +
                ", salary= "+ Salary() +
                ", state Tax= "+stateTax() +
                ", federalTax= "+federalTax()+"" +
                ", salary After Tax= "+salaryAfterTax()+"'}'";
    }
}
/*
salaryCalc
    	Attributes:
    		hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

		Actions:
			setInfo(): sets all the fields of salaryCalc
			salaryCalc(): calculates the salaryCalc ( hourlyRate * weeklyHour * 52)
			stateTax(): claculates the totalstateTax
			federalTax(): calculates the total federal tax
			salaryAfterTax(): calculates the salaryCalc after tax
			toString(): displays the salaryCalc, stateTax, federalTax, salaryAfterTax of the Object

 */