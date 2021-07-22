package day7_ShortHand_Relational;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Aaron King";
        int age = 18;
        String citizen = "USA";
        int creditScore = 630;

        boolean isEligibleToVote = age >=18 && citizen=="USA"&& creditScore==700;

        System.out.println(name+" is Eligible to Vote: " + isEligibleToVote);




    }
}
