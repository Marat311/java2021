package day19_Loops;

public class StringReverce {
    public static void main(String[] args) {

        String name = "Myhtar";

        String reverseName = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            reverseName+=name.charAt(i); //getting the characters starting from last index 0

        }
        System.out.println(reverseName);

        if(name.contains("")){
            System.out.println(name);
        }else{
            System.out.println("Not contains");
        }
    }
}
