package Office_Hourse;

public class CamelCase2 {
    public static void main(String[] args) {

        String str= "thisHasManyWordsToFind";
        String result ="";

        int count = 1;

        if(str.isEmpty()){
            count=0;
        }

        for (int i = 0; i <str.length() ; i++) {  //run string.length

            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){ //if every character of string is Upper case
                System.out.println(result); //we print String result
                result="";  //then we clear result String for other words
            }
            if(i==0){
                result+=(""+str.charAt(i)).toUpperCase();
            }else{
                result+=str.charAt(i);
            }

            result+=str.charAt(i);  //but Uppercase character will be add on string result and before Uppercase character will be stored here

        }
        System.out.println(result);


    }
}
