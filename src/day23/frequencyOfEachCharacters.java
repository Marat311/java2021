package day23;

public class frequencyOfEachCharacters {
    public static void main(String[] args) {

        String str = "aabccc";

        // step 1
        String removeDup = ""; //abc
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i); //find each character of str

            if (removeDup.contains("" + ch)) { // if the character is already contained in removeDup
                continue; // skip it
            }

            removeDup += ch;
        }

        String result = "";  //a2b1c3
        //a b c
        //2 1 3

        // step3
        for (int j = 0; j <= removeDup.length() - 1; j++) { // 0 1 2, outer loop is used for getting each characters from string removeDup

            //step2
            char ch = removeDup.charAt(j);  //'a', 'b', 'c'
            int frequency = 0; // for the frequencies of ch: 2  1  3
            for (int i = 0; i <= str.length() - 1; i++) {  // inner loop is responsible for returning the frequency of ch
                char each = str.charAt(i);
                if (each == ch) {
                    frequency++;
                }
            }

            result += "" + ch + frequency;

        }


        System.out.println(result);



/*
2. find the frequency of each characters from a string
			str = "aabcccd";
			output:
				a2b1c3d1
	step1: need to know how to remove duplicates
	step2: need to know how to fidn the frequency of one character
	step3: use the loop and apply step 2 to the remaining characters of the string
 */
        System.out.println("=====================================");

      String a = "aaabbcddd";

        String removedup2 = "";



  /*     for (int i =0; i<a.length(); i++){
            char ch = a.charAt(i); //every character by string

            if(removedup2.contains(""+ch)){ //if new string contains character, we skip it
                continue;
            }
            removedup2+=ch;  //add each character in removeDup string
        }
        System.out.println("removedup2 = " + removedup2); //abcd

String r = "";

        for (int i=0; i<removedup2.length(); i++){
            char ch2 = removedup2.charAt(i);
            int count = 0;
            for(int j=0; j<a.length(); j++){
                char ch3 = a.charAt(j);
                if(ch2==ch3){
                    count++;
                }
            }
            r+=""+ch2+count; //"" convert to string, if just use r+=ch2+count it will show numbers

        }
        System.out.println(r);

*/

    }
}

