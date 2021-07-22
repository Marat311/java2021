package day20_Loops;

public class frequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "PythonPython is a programming language";
        String word = "Python";
        int count = 0;
        //Python
        for (int i = 0; i <= sentence.length()-word.length(); i++) {
            String each = sentence.substring(i, i+word.length());

            if (each.equals(word)){
                count++;
            }
        }
        System.out.println("count: "+count);





    }


}
