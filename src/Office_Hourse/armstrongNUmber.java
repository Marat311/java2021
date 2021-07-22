package Office_Hourse;

public class armstrongNUmber {
    public static void main(String[] args) {
        System.out.println(isArmstrong1(153));
        for (int i = 0; i < 1000000000; i++) {
            System.out.print(isArmstrong(i)?i+" ":"");

        }


    }
    /*
	Task 2 :   Write a method that can check if a number is Armstrong number
				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number.
				If the number obtained equals the original number then, we call that armstrong number.
				Armstrong numbers are     === 153 370 371 407 === for 3 digits
                153   ==  (1*1*1)+(5*5*5)+(3*3*3)  == 153
                370== (3*3*3)+(7*7*7)+(0*0*0)=
			                1       125      27
			    3        153%10  = 3        153/10= 15
			    5        15%10   = 5        15/10 = 1
			    1        1%10    = 1         1/10 = 0
     */

   public static boolean isArmstrong(int number){

        int lastDigit=0;
        int totalOfDigits=0;
        int originalNumber=number;

        if(number<2){
            return false;
        }

        while(number>0){
            lastDigit=number%10;   //3   5   1
            number/=10;            //15  1   0    number=number/10 ;
            totalOfDigits+=lastDigit*lastDigit*lastDigit;   // 27+125 +1 ==153
            // totalOfDigits+=Math.pow(lastDigit,3);
        } // number 0

        if(totalOfDigits==originalNumber){
            return true;}

        return false;



    }


/*    //create method return type boolean
    public static boolean isArmstrong1(int num){ //153
        //create int variable lastNum, sumOfNums, number
        int lastNumber = 0;  //
        int sumOfNumbers=0;  //
        int originalNumber=num;   // 153

        //create if statement where num<2 ==> false
        if(num<2){
          return false;
        }

        while (num>0){   //create while loop where num > 0 to run loop till num==0
            lastNumber=num%10;  //3 5 1 -reminder will be last number
            num=num/10; //then devided by 10 to remove last number
            sumOfNumbers+=lastNumber*lastNumber*lastNumber;  //last number taken from reminder * three times

        }

        if(sumOfNumbers==originalNumber){ //if all numbers * three times == original number ==>true
            return true;
        }
        return false;
    }
*/
    public static boolean isArmstrong1(int number){ //153
        int originalNUmber = number; //153
        int sumOfNumbers =0;
        int lastNUmber = 0;

        if(number<2){
            return false;
        }
        while (number>0){ //153 15 1 0
            lastNUmber=number%10; //153%10=3   15%10=5   1%10=1
            number=number/10;  //153/10=15   15/10=1  1/10=0
            sumOfNumbers+=lastNUmber*lastNUmber*lastNUmber; //27+125+1=153
        }

        if(originalNUmber==sumOfNumbers){
            return true;
        }
        return false;


    }


}
