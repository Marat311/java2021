package InterviewQuestions;

public class Frequency_of_ech_Character {
    public static void main(String[] args) {
        /*
        2. find the frequency of each characters from a string
			str = "aabcccd";
			output:
				a2b1c3d1
	step1: need to know how to remove duplicates use loop with length of string (Str)
	step2: need to know how to fidn the frequency of one character
	step3: use the loop and apply step 2 to the remaining characters of the string

         */

        String str = "aabcccd"; //given String variable

        String removeDup = ""; //1. create a new string for adding new removes duplicate characters

        for (int i = 0; i <=str.length()-1 ; i++) {  // 2. create loop use given String length
            char each = str.charAt(i);             //3. create char each character and add on new char every character by given string

            if(removeDup.contains(""+each)){  //4. create if statement and compare if removeDup contains each char
                      // contains method used String, that is why we add ("" + ch)
                continue; //  5. if removeDup contains char on given String we skip it

            }
            removeDup+=each; //6. add on removeDup only 1 character by given String, so it means if statement separate duplicates
        }

        System.out.println("remove duplicates: "+removeDup); //abcd

        String result ="";  //create new string we add frequency of characters



        for (int g=0; g<removeDup.length(); g++){ //7. create outer loop for removeDup String!
            // whe removedup first loop, because we need to add char at removeDup in String result at the end
         char each2 = removeDup.charAt(g);    // 8. create new char and add every character by removeDup str
         int frequency=0;    // 9. on loop we create int for count duplicates

             for (int j=0; j<=str.length()-1; j++){ //10. create inner loop use given string
             char each1 = str.charAt(j); //11. craete new char and add on it every character by str
                if(each1==each2){ //12. create if stmt in loop to compare 2 character,
                    // if one of characters will be more then another character
                frequency++; //int frequency will be count by 1;
                }

            }
            result+=""+each2+frequency; //12. add on result str each charatcter by removeDup str and int frequency
            // write this result in outer loop, so it can count all single characters and frequency nums

        }
        System.out.println(result); //13. create println after all loops




    }
}
