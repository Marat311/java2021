package day7_ShortHand_Relational;

public class EligibleForLOan {

    public static void main(String[] args) {
        
        
        String name = "Marina";
        int age = 49;
        int workHistory = 7;
        int creditScore = 750;
        double income = 45000;
        
       boolean isEligible = age>=18 && workHistory>=2 && creditScore>=700 && income>=60000;


      /*  boolean r1 = income>=60000 && workHistory>=2;
        boolean r2 = age >=18 && creditScore >=700;
        boolean isEligible = r1 &&r2;

        boolean r3 = age >=18 && creditScore >=700 && (income>=60000 || workHistory>=2);
        */
        System.out.println(name+ " is Eligible for loan = " + isEligible);
        
    }
}
