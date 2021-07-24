package Office_Hourse;

public class StringPeriod {
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
         */

        String word="abcdefabcdefabcdefabcdef";
        String longestOne="";
        String temp="";


        /*
        a   -->   it has some data
        ab  -->
        ..
        abc --
        abcdef -->
        abcdefa -->
        .
        .
        .
        ..
        abcdefabcdef
         */

        for (int i = 0; i <word.length()/2 ; i++) {
            temp+=word.charAt(i);
          //  System.out.println(temp);
            String[] splitWord = word.split(temp);
            if(splitWord.length==0 && longestOne.length()<temp.length()){
                longestOne=temp;
            }
        }
        System.out.println("longest: "+longestOne);


    }
}
