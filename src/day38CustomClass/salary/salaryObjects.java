package day38CustomClass.salary;

public class salaryObjects {
    public static void main(String[] args) {


        SalaryCalculator sC = new SalaryCalculator();
        sC.salaryCalc(85, 0.04, 0.22, 40);

        SalaryCalculator employee1 = new SalaryCalculator();
        // 65/hour, 7% state tax, 23% federal tax, 45 hours per week
        employee1.salaryCalc(65, 7, 23, 45);

        System.out.println(employee1);

    }
}
