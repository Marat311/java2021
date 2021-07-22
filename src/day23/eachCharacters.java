package day23;

public class eachCharacters {
    public static void main(String[] args) {

        /*find frequesncy of each characters from a string

        str = "aabbccccddd";
         */

        String str = "aabccdddd";
        String removeDup= "";  //a b c d
                            //1 2 3 4
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            char each = str.charAt(i);

            if (removeDup.contains(""+each)){ //if the character is already contained in removeDup
                continue; //skip it
            }






            }
        System.out.println(removeDup);


        }


    }

