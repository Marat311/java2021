package day6_UnaryAndShortHand;

public class PostPrePractice {

    public static void main(String[] args) {

        int a = 1;
        a = -a-- + a++ / -a-- * --a;
        //  -1   +  0  / -1   *  -1 =
        System.out.println(a);  //-1

        int x =10;// x = 10+1=11-1=10+1=11
        x = ++x - x-- + x++ + --x;
        //  11 -  11  + 10  + 10
        System.out.println(x); //20

        int y = 50;
        int z = -y++ + --y - ++y + y--;
        //      -50  +  50  - 51 + 51

        System.out.println("z = " + z); //0
        System.out.println("y = " + y);

        int q = 4;
        int w = q * 4 - q++;
        //      4 * 4 - 4
        System.out.println("w = " + w); //12
        System.out.println("q = " + q); //5


    }
}
