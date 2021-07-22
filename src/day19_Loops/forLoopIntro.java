package day19_Loops;

public class forLoopIntro {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("================");
        for(int i = 0; i <5; i++){
            System.out.println("Hello World");
        }

        System.out.println("=======================");

        String word = "aabbc";
        String result = "";

        for(int i = 0; i <word.length(); i++){
            if(!result.contains(""+word.charAt(i)))
            result+=word.charAt(i);
        }
        System.out.println(result);

    }}
