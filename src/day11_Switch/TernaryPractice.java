package day11_Switch;

public class TernaryPractice {
    public static void main(String[] args) {

        double salary = 90_000;
        int creditScore = 720;
        String result ;

        if(salary>=60000 && creditScore>=650){ // the person is eligible for loan
           result = "Loan Approved";

        }else{ // if the person is not eligible for loan
            result = "Loan Denied";
        }
        System.out.println("result = " + result);

        String sport = "Golf";
        int price = (sport == "Soccer" || sport =="Tennis")? 100:50;
        System.out.println("price = " + price);

        System.out.println("===================");
        
        int n1 = 100,
        n2= 200, 
        n3= 300;
        String result2 = (n1>n2 && n1>n3)? "n1 is bigger":(n2>n1 && n2>n3) ? "n2 is bigger" : "n3 is bigger";

        System.out.println("result2 = " + result2);


        int num = 13;
        String name = "";

        if(num>=1 && num <=12 ){
            name=(num==1)?"Jan" :(num==2)?"Feb":(num==3)?"Mar":(num==4)
                    ?"Apr":(num==5)?"May":(num==6)?"Jun":(num==7)
                    ?"Jul":(num==8)?"Aug":(num==9)?"Sep":(num==10)
                    ?"Okt":(num==11)?"Nov":"Dec";
        }else{
            name= "Invalid";
        }

        System.out.println("name = " + name);

    }
}
