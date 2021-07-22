package Replits;

public class tripples {
    public static void main(String[] args) {
        /*
        We'll say that a "triple" in a string is a char appearing three times
        in a row. Print out the number of triples in the given string.
        The triples may overlap.

Example:

input: abcXXXabc

output: 1
input: abcXXXabc

output: 1
Example:

input: xxxabyyyycd

output: 3
input: xxxabyyyycd

output: 3
Example:

input: java

output: 0
         */
        String str = "xxxabyyyycd";
        int count=0;
        for(int i =0; i<=str.length()-3; i++){
            char ch = str.charAt(i);

            if(ch==str.charAt(i+1) && ch==str.charAt(i+2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

