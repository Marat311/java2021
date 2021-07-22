package day15_String;



public class StringIntro {
    public static void main(String[] args) {

        String word = "apples";
        int mid2 = word.length()/2;  //
        int mid1 = mid2-1;   //
        System.out.println("mid2 = " + mid2);
        System.out.println("mid1 = " + mid1);

        String r = "";
        r=word.substring(mid1, mid2+1);
        System.out.println("r = " + r);
        //char mid2 = word.charAt(((word.length()/2)-1));
    }}