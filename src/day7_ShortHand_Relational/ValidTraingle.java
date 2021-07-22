package day7_ShortHand_Relational;

public class ValidTraingle {
    public static void main(String[] args) {

        int angle1, angle2, angle3;
        angle1=35;
        angle2=100;
        angle3=50;
        boolean compare = angle1+angle2+angle3==180;
        System.out.println("isValid = "+ compare);

    }
}
