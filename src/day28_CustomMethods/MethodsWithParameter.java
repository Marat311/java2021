package day28_CustomMethods;

public class MethodsWithParameter {

    public static void eligibleToBuyAlcohol(int age){
        if(age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }


    }

    public static void main(String[] args) {
        eligibleToBuyAlcohol(30);
    }
}
