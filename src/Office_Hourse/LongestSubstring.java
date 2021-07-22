package Office_Hourse;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LongestSubstring {
    public static void main(String[] args) {
/*
        Task 4 :  For

                          Biggest substring of matching characters
                          Given a String find the biggest substring of chars that match and print it.

                          Ex: aaabbbcccccddddee Output: ccccc
         */

        String str = "aaabbbcccccddddeeeeee";
        String longestSubstring = "";
        String temprorary = "";

        for (int i = 0; i < str.length() - 1; i++) {


            temprorary += str.charAt(i);

            if (str.charAt(i) != str.charAt(i + 1) || i==str.length()-2) {
                if(i==str.length()-2 && str.charAt(i)==str.charAt(i+1)) {
                    temprorary+=str.charAt(i+1);
                }

                if (temprorary.length() > longestSubstring.length()) {
                    longestSubstring = temprorary;
                }


                temprorary = "";
            }


        }


        System.out.println(longestSubstring);



    }

    }



