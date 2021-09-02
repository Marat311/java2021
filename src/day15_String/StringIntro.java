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
        String s = new String();
        Test3 t = new Test3("Marina");
        System.out.println(t);
        //char mid2 = word.charAt(((word.length()/2)-1));
    }}