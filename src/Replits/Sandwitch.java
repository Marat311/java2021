package Replits;

public class Sandwitch {

    public static void main(String[] args) {

        String sandwitch = "xxbreadapplebr";

        int firstBread = sandwitch.indexOf("bread");
        int secBread = sandwitch.lastIndexOf("bread");

        //System.out.println(firstBread);
        //System.out.println("secBread = " + secBread);

       // String something = sandwitch.substring(sandwitch.indexOf("d"), sandwitch.lastIndexOf("b"));
       // System.out.println(something);

        if(firstBread>=0 && secBread>0 && firstBread!=secBread){

            System.out.println(sandwitch.substring(sandwitch.indexOf("d")+1, sandwitch.lastIndexOf("b")));
        }else{
            System.out.println("nothing");
        }


    }
}
