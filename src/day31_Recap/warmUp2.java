package day31_Recap;

//import packageName.nameClass
import Utilities.StringUtility;

public class warmUp2 {

    public static void main(String[] args) {

        String sentence = "Java java JaVA, JAVA, jAVA";
        String word = "java";

       int n2 = frequencyOfWord(sentence, word);

        System.out.println(n2);

        System.out.println("+++++++++++++++++++++");

        String str = "Racecar";
        boolean isPalindrom = StringUtility.isPalindrome(str);
        System.out.println("isPalindrom = " + isPalindrom);

        String str2 = "CCYYBBEERRRTTTEEEKKKK";
        str2=StringUtility.removeDup(str2);

        System.out.println(str2);
    }

    public static int frequencyOfWord(String sentence, String word){
        int count = 0;
        sentence= sentence.toLowerCase();
        word= word.toLowerCase();
        while(sentence.contains(word)){
            sentence= sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }



}
