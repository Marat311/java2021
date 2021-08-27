package Replits.OOP;

import java.util.Scanner;

public class TVObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());
        tv.turnOff();
        tv.setChannel(in.nextInt()); //5

        TV tv2 = new TV(in.next());//LG
        tv2.turnOn();
        tv2.turnOn();
        tv2.setChannel(in.nextInt()); //5

        tv2.setChannel(in.nextInt());
        tv2.setVolumeLevel(in.nextInt()); //7
        tv2.volumeUp();
        in.close();
    }
}
