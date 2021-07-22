package day8_ifStatement;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "Matt";
        int age = 15;
        String citizen = "USA";

        boolean eligibleToVote = age>=21 && citizen=="USA";
        if(eligibleToVote){
            System.out.println(name+ " is eligible To Vote");
        }

        if(!eligibleToVote){
            System.out.println(name+ " is not eligible To Vote");
        }

    }
}
