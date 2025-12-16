package HomeWork.MadalinaSamoila.HomeworkJava3;

public class ElonsToyCar {

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();

        car.drive();
        car.drive();

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());

    }

    private int distanceDriven;
    private int batteryPercentage;


    private ElonsToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

//    Ex1
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
//    Ex2

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }
//    Ex3

    public String batteryDisplay() {
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

//    Ex 4-6
public void drive() {
    if (batteryPercentage > 0) {
        distanceDriven += 20;
        batteryPercentage -= 1;
    }
}
}
