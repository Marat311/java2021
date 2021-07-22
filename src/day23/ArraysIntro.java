package day23;

public class ArraysIntro {
    public static void main(String[] args) {

        String [] group1 = {"Marina", "Alex", "Venya", "Matthew"};
            // index         0            1        2          3

        //retrieve data from array
        System.out.println(group1[0]); //MArina
        System.out.println(group1[1]); //Alex
        System.out.println(group1[2]); //Venya
        System.out.println(group1[3]);//Matthew


        System.out.println("====================");


        for (int i = 0; i <=3 ; i++) {
            System.out.println(group1[i]);
        }
    }
}
