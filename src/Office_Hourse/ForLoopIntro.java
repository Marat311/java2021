package Office_Hourse;

public class ForLoopIntro {
    public static void main(String[] args) {
        /*
        for (init: condition; iteration)

        init: int=0; char a ='a'

       condition: true/false

       iteration: not mandatory but we should increment ++ /decrement -- i+=10 i++ i-=10 i--
         */
int i = 0;
        for( i =0; i<10; i++){
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Out of loop");
        System.out.println("i = " + i);

        String name = "Cybertek School";
        for (i=0; i<name.length();i++){
            System.out.print(name.charAt(i));
        }
        System.out.println();

        System.out.println("reverse loop");

        for (i=name.length()-1; i>=0; i--){
            System.out.print(name.charAt(i));
        }
        System.out.println("__________________________");


        for (i = 0;  i<name.length() ; i++) {
            if(name.charAt(i)=='o' || name.charAt(i)=='i' || name.charAt(i)=='u' || name.charAt(i)=='e'){
                continue;
            }

            System.out.print(name.charAt(i));
        }


    }
}
