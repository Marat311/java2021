package day10_NestedIf;

public class CampusHOur {
    public static void main(String[] args) {

int time =9;
String result = "";

if(time>=8&& time<=23){
    result="Open";
}else{
    result="Closed";
}
        System.out.println("result = " + result);
    }


}
