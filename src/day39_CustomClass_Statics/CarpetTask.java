package day39_CustomClass_Statics;

import java.util.ArrayList;
import java.util.Arrays;

class Carpet{
    public double width, length, unitPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        if(isPersian) {
            return ((width * length) * unitPrice)+200;
        }else{
            return (width * length) * unitPrice;
        }
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                "', price="+calcCost()+"}'";
    }
}

public class CarpetTask {
    public static void main(String[] args) {

        day38CustomClass.carpetTask.Carpet carpet = new day38CustomClass.carpetTask.Carpet();
        day38CustomClass.carpetTask.Carpet carpet1 = new day38CustomClass.carpetTask.Carpet();
        day38CustomClass.carpetTask.Carpet carpet2 = new day38CustomClass.carpetTask.Carpet();
        day38CustomClass.carpetTask.Carpet carpet3 = new day38CustomClass.carpetTask.Carpet();
        day38CustomClass.carpetTask.Carpet carpet4 = new day38CustomClass.carpetTask.Carpet();

        carpet.customOrder(10.5, 15.5, 125, true);
        carpet1.customOrder(12.8, 13.7, 96, true);
        carpet2.customOrder(11.3, 11.2, 100, false);
        carpet3.customOrder(15, 17.5, 140, false);
        carpet4.customOrder(17.5, 20.5, 180, true);

        ArrayList<day38CustomClass.carpetTask.Carpet> carpets = new ArrayList<>(Arrays.asList(carpet, carpet1, carpet2, carpet3, carpet4));
        ArrayList<day38CustomClass.carpetTask.Carpet> persianCarpets = new ArrayList<>();
        ArrayList<day38CustomClass.carpetTask.Carpet> regularCarpets = new ArrayList<>();

        for(day38CustomClass.carpetTask.Carpet each:carpets){
            if(each.isPersian){

                persianCarpets.add(each);
            }else{
                regularCarpets.add(each);
            }
        }


        System.out.println("persianCarpets = " + persianCarpets);
        System.out.println("regularCarpets = " + regularCarpets);


    }
}
