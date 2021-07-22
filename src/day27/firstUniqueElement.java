package day27;

public class firstUniqueElement {
    public static void main(String[] args) {

        /*
        array:{1,2,1,3,3,4,5,5,5,6,6,6,7,7,7,8}
        output: 2
         */

        int[] nums = {1,2,1,3,3,4,5,5,5,6,6,6,7,7,7,8};
        int firstUniqueElement = 0;
        int firstUniqueElement1 = 0;

        for (int j = 0; j <nums.length ; j++) { //outer loop: responsible for repeating the inner loop to find frequency


            int frequency = 0;
            for (int i = 0; i < nums.length; i++) { //inner loop: responsible for finding the frequency of one elements
                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }
            if(frequency==1){  //if element is unique
                firstUniqueElement=nums[j];
                break;  //to make shure only the first unique element is returned from loop
            }
        }
        System.out.println(firstUniqueElement);


        System.out.println("++++++++++++++for each loop ++++++++++");

        for(int each  : nums ) {// outer loop: responsible for repeating the inner loop to find frequency of each element

            int frequency1 = 0;
            for (int element : nums) {  // inner loop: responsible for finding the frequency of one element
                if (element == each) {
                    frequency1++;
                }
            }

            if(frequency1 == 1){ // if element is unique: 2, 4
                firstUniqueElement1 = each;
                break;  // to make sure only the first unique element is returned from the loop
            }

        }


        System.out.println(firstUniqueElement1);
    }
}
