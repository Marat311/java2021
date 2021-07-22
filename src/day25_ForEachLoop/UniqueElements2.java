package day25_ForEachLoop;

public class UniqueElements2 {
    public static void main(String[] args) {


        char[] chars = {'A', 'B', 'A', 'C', 'A', 'D', 'D'};

        for(char ch: chars){

            int count=0;

            for (char each: chars){

                if(each==ch){
                    count++;
                }

            }

            if(count==1){
                System.out.println(ch);
            }
        }
    }
}
