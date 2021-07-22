package day20_Loops;

public class CatsAndDogs {
    public static void main(String[] args) {
        String sentence = "CatCat";
 //index 14
        int numberOfCats = 0;
        int numberOfDogs = 0;

        for (int i = 0; i <=sentence.length()-3 ; i++) { //
         String each = sentence.substring(i,i+3);  //has 3 characters
            if(each.equals("Cat")){
                numberOfCats++;
            }
            if(each.equals("Dog")){
                numberOfDogs++;
            }


        }
        System.out.println("numberOfDogs = " + numberOfDogs);
        System.out.println("numberOfCats = " + numberOfCats);
        boolean equal = numberOfCats==numberOfDogs;
        System.out.println(equal);


    }
}
