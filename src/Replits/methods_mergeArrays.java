package Replits;

import java.util.Arrays;

public class methods_mergeArrays {
    /*
    mergR merges two arrays into one. It gets two int arrays and returns an int array

Example:

mergR([1,2,3],[4,5,6])

returns [1,2,3,4,5,6]
mergR([1,2,3],[4,5,6])

returns [1,2,3,4,5,6]
mergR([1,2],[6,8])

returns [1,2,6,8]
mergR([1,2],[6,8])

returns [1,2,6,8]
hint:

create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).
loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).
do the same for the second array.
     */
    public static void main(String[] args) {
        int a[] ={1,2,3};
        int b[] = {4,5,6};
        int res [] = Arrays.copyOf(a, a.length+b.length);
        for(int i = 0, j=a.length; i<b.length; i++, j++){
            res[j]=b[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
