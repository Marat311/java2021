package day19_Loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word = "aabcccccdeeeeeeefhhhhhhhi";

        String result = "";

     //   boolean isUnique = word.indexOf('b')==word.indexOf('b');
     //   System.out.println(isUnique);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
           boolean isUnique = word.indexOf(ch)==word.lastIndexOf(ch);
           //if the first and last index numbers of the character are same, then the character is unique

           if(isUnique){
               result+=ch;
           }
        }
        System.out.println(result);


    }
}
