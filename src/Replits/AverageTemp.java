package Replits;

import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() ,
                scan.nextDouble()  };

        double average=0;

        for (int i = 0; i <temps.length ; i++) {
            average+=temps[i];
        }
        System.out.println(average/temps.length);







    }
}
