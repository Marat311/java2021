package Replits;

public class Hi_count {
    public static void main(String[] args) {


        String str = "Hifjkfghi";

        int count=0;
        for(int i=0; i<str.length()-1; i++){
            String each = str.substring (i, i+2);
            System.out.println("each = " + each);

            if(each.equalsIgnoreCase("hi")){
                count++;
            }

        }

        System.out.println(count);
    }
}