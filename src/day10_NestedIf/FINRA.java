package day10_NestedIf;

public class FINRA {

    public static void main(String[] args) {

        int number =9;
        String result="";

        if(number%3==0 && number%5==0){
        result="FINRA";
        }else if(number%5==0){
        result="RA";
        }else if(number%3==0){
            result = "FIN";
        }else{
            result+=number;
        }
        System.out.println(result);

    }
}
