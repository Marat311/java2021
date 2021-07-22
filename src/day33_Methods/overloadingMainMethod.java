package day33_Methods;

import java.util.Arrays;

public class overloadingMainMethod {
    public static void main(String[] args) {
        System.out.println("String");
        int n  [] = {1,2};
        main(n);
    }

    public static void main(char[] args) {
        System.out.println("char");

    }

    public static void main(int[] args) {

        System.out.println("int");
    }
}
