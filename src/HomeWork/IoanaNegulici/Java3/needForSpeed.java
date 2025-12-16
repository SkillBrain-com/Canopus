package HomeWork.IoanaNegulici.Java3;


public class needForSpeed {
    public static void main(String[] args) {
        needForSpeed car = new needForSpeed(5, 2);
        System.out.println("The speed car is " + car.speed + " and the battery drain is " + car.batteryDrain);
        car.drive();

        System.out.println("The battery is " + car.battery + " %");
        System.out.println("The car traveled " + car.distanceDriven() + " metters");
        System.out.println("The battery is empty? " + car.batteryDrained());
        nitro();
        System.out.println(needForSpeed.nitro());

//        needForSpeed nitro = needForSpeed.nitro();
//        System.out.println(nitro);

    }

    //1.  Creating a remote controlled car
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int battery;

    public needForSpeed(int speed, int batteryDrain) {
        this.speed = 5;
        this.batteryDrain = 2;
        this.distanceDriven=0;
        this.battery=100;
    }
    // 3. Drive the car
    public void drive(){
        if (batteryDrain!=0) {
            distanceDriven = distanceDriven + speed;
            battery = battery - distanceDriven;
            System.out.println("The distance draven is " + distanceDriven + " meters");
        }

    }
    public int distanceDriven(){
        return distanceDriven;
    }
    // 4. Check for a drained battery
    public boolean batteryDrained(){
        if(batteryDrain==0){
            return true;

        }
        else return false;

    }
    // 5. Create the Nitro remote control car
    public static needForSpeed nitro(){
        return new needForSpeed(50, 4);


    }

}