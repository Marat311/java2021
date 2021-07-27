package InterviewQuestions;

public class repetitiveString {
    public static void main(String[] args) {
        /*
        Task 5 : Longest Repetitive Substring -- Real Interview Task
    		Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    		Your program should return longest substring K, and
    		if there is none it should be return "There is no repetitive substring"
    		For Example is str ="abcababcababcab"  			   output should be abcab
    					   str ="abcdefabcdef"     			   output should be abcdef
    					   str ="abcdefabcdef abcdefabcdef"     output should be abcdefabcdef
    					   str ="abcdefxabcdef"				   output should be "There is no repetitive substring"
                                abcabc      abc

        String str = "abcdefabcdefabcdefabcdef"; //abcdef 4 times
        String longestWord = "";  //to put result
        String characters = "";

        for(int i = 0; i<str.length()/2; i++ ){
            characters+=str.charAt(i); //put one by one char to the string
            String[] splitChars = str.split(characters); //split long word use characters one by one

            if(splitChars.length==0 && longestWord.length()<characters.length()){
                //if splitCharacter length==0 and longest word<character.length, then we add character to longest word
                longestWord=characters;
            }



        }
        System.out.println(longestWord);
*/
        String str = "abcdefabcdefabcdefabcdef";
        //1
        /*  1. create 2 Strings for result and for characters
        */
        String result = ""; //abcdefabcdef
        String characters = ""; //abcdefabcdef
        //2
        /*  2. create for loop to run longest String, and if String too long
        we can use half length of String
         */
        for(int i = 0; i<str.length(); i++){ // a b c d e f a b c d e f
            characters+=str.charAt(i); // abcdefabcdef
            String[] splitWord =str.split(characters); //["", ""]
            if(splitWord.length==0 && result.length()<characters.length()){
                result=characters;
            }
        }
        System.out.println(result);
        //3
        /*   3. On loop we add one by one every character to String chars
         */
        //4
        /*  4. then we create new Array String and put on this array longest string splitted by characters
         */
        //5package InterviewQuestions;
        //
        //public class repetitiveString {
        //    public static void main(String[] args) {
        //        /*
        //        Task 5 : Longest Repetitive Substring -- Real Interview Task
        //    		Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
        //    		Your program should return longest substring K, and
        //    		if there is none it should be return "There is no repetitive substring"
        //    		For Example is str ="abcababcababcab"  			   output should be abcab
        //    					   str ="abcdefabcdef"     			   output should be abcdef
        //    					   str ="abcdefabcdef abcdefabcdef"     output should be abcdefabcdef
        //    					   str ="abcdefxabcdef"				   output should be "There is no repetitive substring"
        //                                abcabc      abc
        //
        //        String str = "abcdefabcdefabcdefabcdef"; //abcdef 4 times
        //        String longestWord = "";  //to put result
        //        String characters = "";
        //
        //        for(int i = 0; i<str.length()/2; i++ ){
        //            characters+=str.charAt(i); //put one by one char to the string
        //            String[] splitChars = str.split(characters); //split long word use characters one by one
        //
        //            if(splitChars.length==0 && longestWord.length()<characters.length()){
        //                //if splitCharacter length==0 and longest word<character.length, then we add character to longest word
        //                longestWord=characters;
        //            }
        //
        //
        //
        //        }
        //        System.out.println(longestWord);
        //*/
        //        String str = "abcdefabcdefabcdefabcdef";
        //        //1
        //        /*  1. create 2 Strings for result and for characters
        //        */
        //        String result = ""; //abcdefabcdef
        //        String characters = ""; //abcdefabcdef
        //        //2
        //        /*  2. create for loop to run longest String, and if String too
        /*  5. we create if statement to put repetattive characters to String
              at if statement we neeed condition
              if character length ==0 and longest word< splitted word then we add on longest characters to result
         */



    }
}
