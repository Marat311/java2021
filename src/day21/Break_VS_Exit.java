package day21;

public class Break_VS_Exit {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if(i==3) {
                break;

            }
            System.out.println("Cybertek school");
        }
        System.out.println("Batch 23");



        for (int i = 0; i < 5; i++) {
            if(i==3) {
                System.exit(0);

            }
            System.out.println("Cybertek school");
        }
        System.out.println("Batch 23");

    }
}
