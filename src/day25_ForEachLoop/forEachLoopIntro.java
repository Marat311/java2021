package day25_ForEachLoop;

public class forEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        for (int i = 0; i <numbers.length ; i++) { //i: index numbers of the array
            System.out.println(numbers[i]);
        }
        System.out.println("===================");

        for(int each : numbers){ //each : elements of the array not index!
            System.out.println(each);
        }

        System.out.println("===================");

        String [] names = {"Marina", "Mykyta", "Ahmed", "Andrey", "Ivan"};

        for (String each:names) {
            System.out.print(each+", ");
        }


    }
}
