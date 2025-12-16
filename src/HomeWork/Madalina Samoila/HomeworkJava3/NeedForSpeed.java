package HomeworkJava3;

public class NeedForSpeed {

    private final int speed;
    private final int batteryDrain;
    private int distanceDriven;
    private int batteryPercentage;

//    Ex 1
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }
    public void drive() {
        if (batteryPercentage >= batteryDrain) {
            distanceDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }

//    Ex3

    public int distanceDriven() {
        return distanceDriven;
    }

//    Ex4

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

//    Ex5

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }




}
