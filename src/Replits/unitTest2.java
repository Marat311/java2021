package Replits;

public class unitTest2 {
    public static void main(String[] args) {
        int count = 0;

        for(int a = 0; a<4; a++){ //0123
            if(a==3) continue;

            for(int b = a+1; b<5; b++){ //1,2,3,2,3
                count++;// 1+1+1+1+1+1
                if(b==3) break;
            }
        }

        System.out.println(count); //6

        System.out.println("++++++++++++++++");

        String input = "today it will be 100 degrees !";
        int n = 0;

        while(n++< input.length()){
            if(n==8){
                continue;
            }else if(n==9){
                break;
            }
            System.out.println(input.charAt(++n));
        }
        System.out.println("=====================");

        String str = "cybertek";
        for(int i = 0; i<=str.length()-1; i+=2){
            System.out.println(str.charAt(i)); //cbre
        }

        System.out.println("=================");

        String str1 = "The whole time it was raining.";

        do{
            System.out.println(str1.charAt(0));
            str1=str1.substring(3);
        }while(!str1.isEmpty());

        System.out.println("++++++++++++++++++");

        int number = 5;
        while(number<100){
            number+=number;
        }
        System.out.println(number); //80

        System.out.println("---------------------");

        String s = "the game was tied at 2-2";
        String s2 = s.substring(5); //game was tied at 2-2

        int index1= s.indexOf("game"); //
        int index2 = s2.indexOf("game"); //

        if(index1==index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);  //-1
        }

        String a = "123";
        String b = 5+4+a;
        System.out.println(b); //9123

        int a1 = 0;
        do{
            a1=a1++ + --a1 - (a1%3);
        }while(++a1<4);
        System.out.println(a1);



    }
}
