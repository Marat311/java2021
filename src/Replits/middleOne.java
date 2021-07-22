package Replits;

import java.util.Scanner;

public class middleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        boolean odd = word.length()%2!=0;
        boolean even=word.length()%2==0;

        int mid2 = word.length()/2;
        int mid1 = mid2-1;
        char mid = word.charAt(mid2);

        String r = "";

        if(odd && word.length()>=3){
            r+=mid;
        }else if(odd && word.length()==1){
            r=word+""+word+word;
        }else if(even && word.length()>=4){
            r=word.substring(mid1, mid2+1);
        }else{
            r=word+word;
        }
        scan.close();
        System.out.println(r);
    }
}
