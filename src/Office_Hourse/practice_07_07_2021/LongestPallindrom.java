package Office_Hourse.practice_07_07_2021;

public class LongestPallindrom {
     /*
         Task 4 :  For Each - Nested For

    		Longest Palindrome

       		 Given a String array. Find the longest Palindrome String in your array.
			        Ex:
			        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
			        Ex:
			        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
			        Output: No palindrome
         */
     public static void main(String[] args) {

         String words[]={"java", "longer word", "civic","apple", "racecar", "mom", "anna"};
         String longestPalindrome="";

         for(String each:words){ //create outer loop to repeat all words
             boolean isPalindrome=true; // create boolean
                /*
            civic

            c  !=  c
            isPalindrome = false ;
            break ;

            racecar
            0123456

            r r
             */


             for (int i = 0; i <each.length()/2 ; i++) { //run inner loop to check all characters
                 char c = each.charAt(i); //character started from the biggining
                 char c1 = each.charAt(each.length()-1-i); //character starts from the end
                 if(each.charAt(i)!=each.charAt(each.length()-1-i)){
                     isPalindrome=false;
                     break;
                 }
             }

             if(isPalindrome && each.length()>longestPalindrome.length()){
                 longestPalindrome=each;
             }


         }
         System.out.println("longestPalindrome = " + longestPalindrome);


     }
}
