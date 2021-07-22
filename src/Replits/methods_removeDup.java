package Replits;

public class methods_removeDup {
    /*
    uniqueChars is a method that will accept any String and return the
    String with out any dupclicate characters

Examples:

uniqueChars("java") ==> "jav"
uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
     */
    public static void main(String[] args) {
       String str = "java";
        System.out.println(removeDup(str));

    }
   public static String removeDup(String str){ //java

        String [] result = str.split(""); // [j, a, v, a]
       String r="";
       for (String each:result){
           if(r.indexOf(each)<0){
               r+=each;
           }
       }
return r;
   }


}
