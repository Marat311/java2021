package day19_Loops;

public class FINRA {
    public static void main(String[] args) {

        String result = "";
        for (int i = 1; i <=100 ; i++) {
           /* if(i%15==0) {
                result+="FINRA ";
            }else if(i%3==0){
                result+="FIN ";
            }else if(i%5==0){
                result+="RA ";
            }else{
                result+=i+" ";

            */

            result += (i%15==0)?"FINRA ":(i%3==0)?"FIN ":(i%5==0)?"RA ":i+" ";
            }
        System.out.print(result);
        }



    }

