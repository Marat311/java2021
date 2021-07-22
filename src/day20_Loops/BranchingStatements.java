package day20_Loops;

public class BranchingStatements {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            if(i==3){
            break;
            }
            System.out.println("i = " + i);
        }

        System.out.println("-----------------------");

        for (int i = 0; i <=5 ; i++) {

            if (i==3){
                System.out.println("i = " + i);
           break;
            }


        }

        System.out.println("-----------------------------");
        for (int i = 0; i <=5 ; i++) {

            if (i == 3) {

        continue;

        }

            System.out.println("i = " + i);
        }
        System.out.println("++++++++++++++++++++++++++");

        //printing odd numbers between 1~10 MUST use continue

        for (int i = 0; i <=10 ; i++) {

            if(i%2==0){
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("++++++++++++++++++++++++++");
        //print o=all numbers between 1-100 that are evenly divisible by 3 and 5

        for (int i = 1; i <=100 ; i++) {

        if(i%15!=0 ){
            continue;
        }
            System.out.print(i+" ");
        }

        System.out.println("==========================");
        
        //print all letters between A~Z except for D, T, X







    }
}
