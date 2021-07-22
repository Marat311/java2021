package day18_Racap;

public class StringMethods {
    public static void main(String[] args) {

        String str = "abcd";
        int r = str.indexOf("k");

        System.out.println("index of k: "+r);

        if(r>=0){
            System.out.println("The string has character k");
        }else{
            System.out.println("The string does not have character k");
        }
        System.out.println("______________________");

        String sentence = "I like to learn C#, C# is coll J";
        //verify if the sentence has "Java"

        if(sentence.indexOf("J")>=0){
            System.out.println("sentence has java");
        }else {
            System.out.println("sentence does not have java");
        }

        System.out.println("===============");

        String sentence2 = "I love Java, Java is cool";

        boolean isUnique = sentence.indexOf("Java")==sentence2.lastIndexOf("Java");

        System.out.println("isUnique = " + isUnique);

        String sentence3 = "Java Java Java";
        sentence3 = sentence3.replace("Java Java", "C# Phyton");

        System.out.println(sentence3);



    }
}
