package Replits.OOP;

public class ParkingMeter {
    public int timeLeft =0;
    public int  maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(int value){
        boolean b = false;
        if(value==25){

            if(timeLeft+30>maxTime){
                b= false;
            }else{
                b= true;
                timeLeft+=30;
            }
        }
        return b;
    }

    public void tick(){
        if(timeLeft>0){
            timeLeft--;
        }
    }

    public boolean isExpired(){
        boolean b ;
        if(timeLeft==0){
            b=true;
        }else{
            b=false;
        }
    return b;
    }

}