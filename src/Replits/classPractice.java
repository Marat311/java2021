package Replits;

public class classPractice {
    public static void main(String[] args) {



                System.out.println("***** None - Boxing ***************");

                Boolean b1 = Boolean.parseBoolean("tRUE");
        System.out.println(b1);
                Boolean b2 = Boolean.valueOf("true");
                System.out.println("last one "+(b2==b1));


                System.out.println("b1 = " + b1); //true
                System.out.println("b2 = " + b2); //true


                System.out.println("******* Auto - Boxing *************");

                Boolean r1 = Boolean.parseBoolean("false");
                Boolean r2 = Boolean.parseBoolean("true");

                System.out.println("r1 = " + r1.equals(r2)); //true
                System.out.println("r2 = " + r2); //true

                System.out.println("****Boolean wrapper class object ****");
                // Boolean wrapper class object
                Boolean r3 = new Boolean("True");
                Boolean r4 = new Boolean(true);
                System.out.println("r3 = " + r3);  //true
                System.out.println("r4 = " + r4); //true


        String str2 = "TRUE";
        Boolean r5 = Boolean.parseBoolean("true");
        boolean bul =  10<12;
        System.out.println("last one "+r5.equals(bul)); //true


            }
        }

