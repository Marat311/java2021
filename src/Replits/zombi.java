package Replits;

import java.util.Scanner;

public class zombi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int count = 0;

      for ( int i = inhabitants; i>=0; i--) {

          if(inhabitants>0){

              System.out.println("Day "+count+" [" +inhabitants+"]"); //25
              count++;
              inhabitants/=2;
           }else{
              System.out.println("----EXTINCY----");
              break;
          }

      }

        scan.close();

    }

}

