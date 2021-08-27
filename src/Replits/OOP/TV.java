package Replits.OOP;

public class TV {
    public int channel = 1;
    public int volumeLevel = 0;
    public boolean on = false;
    public String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand){
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel){

        if(on==true){

            if(volumeLevel>0 && volumeLevel<7){
                this.volumeLevel=volumeLevel;
            }else{
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            }


        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }


        }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getChannel(){
        return channel;
    }

    public void setChannel(int channel){
      if(isOn()){
          if(channel>1 && channel<120){
              this.channel=channel;
          }else{
              System.out.println("ERROR: TV is either OFF or invalid Channel");
          }

      }else{
          System.out.println("ERROR: TV is either OFF or invalid Channel");
      }

    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void channelUp(){

        channel++;
    }

    public void channelDown(){
        channel--;
    }

    public void volumeUp(){
        volumeLevel++;
    }

    public void volumeDown(){
        volumeLevel--;
    }

    public boolean isOn(){
        if(on==true){
            return true;
        }else {
            return false;
        }

    }

    public void turnOn(){
        if(isOn()==true){
            System.out.println("TV is already ON");

        }
        on = true;
    }

    public void turnOff(){
        if(on==false){
            System.out.println("TV is already OFF");

        }
        on = false;
    }



}
