package Office_Hourse;

public class CamelCase {
    public static void main(String[] args) {

        String str= "thisHasManyWordsToFind";

        int count = 1;

        if(str.isEmpty()){
            count=0;
        }

        for (int i = 0; i <str.length() ; i++) {

            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                count++;
            }

        }


    }
}
