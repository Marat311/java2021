package day35ArrayList;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {


        int[] nums = new int[10]; //size is 10 and it fixed
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[2]);// 0

        ArrayList<Integer> arrayList = new ArrayList<>(); //size is 0
        System.out.println(arrayList);
        arrayList.add(10); //autoboxing,0
        arrayList.add(arrayList.size()-1); //move  10 element and 0 index will be 20
        System.out.println(arrayList);
        arrayList.add(30);//2
        arrayList.add(40);//3
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(2,3);

        System.out.println(arrayList); //[10, 20, 30, 40]
        System.out.println(arrayList.get(2));  //30
        System.out.println("size: "+ arrayList.size());
        System.out.println("----------------------");
        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        for(Integer each   : arrayList  ){
            System.out.println(each);
        }




    }
}