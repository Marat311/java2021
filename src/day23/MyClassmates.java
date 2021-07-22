package day23;

public class MyClassmates {
    public static void main(String[] args) {

        //if we know what are the elements are
        String [] friends = {"Marina", "Julia", "Sonya", "Marina"}; //4 size
        System.out.println("Size: "+friends.length);

        for (int i=0; i<friends.length; i++) { //i: index number of the array
            System.out.println(friends[i]);
        }

        System.out.println("====================================");
            //if we dont know what are the elements are but we dont know how many elements we wanna store
            String[] friends1 = new String[4]; //size 4 //size to array has to be fixed!!!
            System.out.println("Size: " + friends1.length);

            friends1[0]="Marina";
            friends1[1]="Sonya";
            friends1[2]="Leo";
            friends1[3]="Jack";
            friends1[4]="Muhtar"; //Array's size are fixed!! we can't add more then declared on the size arrays, it was 4

            for (int j = 0; j < friends1.length; j++) {
                System.out.println(friends1[j]);
            }



    }
}
