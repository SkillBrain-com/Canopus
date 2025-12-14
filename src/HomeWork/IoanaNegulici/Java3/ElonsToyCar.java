package HomeWork.IoanaNegulici.Java3;

public class ElonsToyCar {
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println("The new car has " + car.batteryPercentage + " % battery procentage");
        System.out.println("The new car has " + car.distanceDriven + " distance driven");

        System.out.println(car.distanceDisplay());

        System.out.println(car.batteryDisplay());

        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        for(int i=0; i<5; i++){
            car.drive();
        }
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

    }

    private int batteryPercentage;
    private int distanceDriven;

    private ElonsToyCar (){
        this.batteryPercentage = 100;
        this.distanceDriven = 0;
    }

    // 1. Buy a brand-new remote controlled car
    public static ElonsToyCar buy (){
        return new ElonsToyCar();
    }

    // 2. Display the distance driven
    public String distanceDisplay(){
        return "Driven " + distanceDriven + " meters";
    }

    // 3. Display the battery percentage
    public String batteryDisplay(){
        return "Battery is " + batteryPercentage + " %";
    }

    // 4. Update the number of meters driven when driving && 5. Update the battery percentage when driving
    // && 6.Prevent driving when the battery is drained
    public void drive (){
        if (batteryPercentage > 0){
            distanceDriven +=20;
            batteryPercentage--;
            System.out.println("The distance draven is " + distanceDriven + " meters");
        }
        else if(batteryPercentage == 0) {
            System.out.println("Battery empty");
        }

    }

}
