package Replits;

public class utopianTree1 {
    public static void main(String[] args) {
        int count=0;
        int cm=0;

        for(int i = 1; i<=10; i++){

            if(i<=3){

                    cm = 1;

                    count += cm;

            }
            if (i>3){
                cm = 2;

                count+=cm;
            }
            System.out.println("year "+i+ " - growth "+cm+" cm"+"\ntree size: "+count+" cm");

        }


    }

    }

