package HomeWork.PatriciaDurand.Java3;

public class NeedForSpeed {

    public int speed;
    public int batteryDrain;
    public int battery = 100;
    public int distanceDriven = 0;

//    ex1
    public NeedForSpeed(int speed, int batteryDrain) {
       this.speed = speed;
       this.batteryDrain = batteryDrain;
    }

//    ex3
    public void drive(){
if (battery >= batteryDrain){
    distanceDriven += speed;
    battery -= batteryDrain;
}
    }

    public int distanceDriven(){
        return distanceDriven;
    }

//    ex4
    public boolean batteryDrained(){
        return battery < batteryDrain;
    }

//    ex5
    public static NeedForSpeed nitro(){
        return new NeedForSpeed(50, 4);
    }
}
