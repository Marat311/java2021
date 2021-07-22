package day27;

public class firstUniqueCharacter {
    public static void main(String[] args) {

        String str = "aaabcc ddefggggh"; //b,e,f,h

        //indexOf('a')==>0
        //lastIndexOf('a')==>0

         /*
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
        }
         */

        for(char each:str.replace(" ", "").toCharArray()){  //str cant add, now we store array with each character use toCharArray() method
//replace-remove all spaces
            if(str.indexOf(each)==str.lastIndexOf(each)){  //if the char first and last index number are same then the character is unique
                System.out.println( each);
                break;//if we want find first unique elem we use break;
            }
        }



    }
}
