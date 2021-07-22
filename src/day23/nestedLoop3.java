package day23;

public class nestedLoop3 {
    public static void main(String[] args) {

        for (int i = 1; i <=8 ; i++) { //number of lines

            for (int j = 1; j <=i ; j++) { // i: number of * in each line
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
