package HomeWork.PatriciaDurand.Java3;

public class ElonsToyCar {
    public static void main(String[] args) {

        ElonsToyCar car = ElonsToyCar.buy();

        System.out.println(car.distanceDiaplay());
        System.out.println(car.batteryDisplay());

          car.drive();
          System.out.println(car.distanceDiaplay());
          System.out.println(car.batteryDisplay());
          car.drive();
          System.out.println(car.distanceDiaplay());
          System.out.println(car.batteryDisplay());


//   ex6.Prevent driving when the battery is drained
        for (int i=0; i< 100; i++){
            car.drive();
    }
        System.out.println(car.distanceDiaplay());
        System.out.println(car.batteryDisplay());

    }

//   ex1.Buy a brand-new remote controlled car
    public static ElonsToyCar buy(){
        return new ElonsToyCar();
    }

//   ex2.Display the distance driven
    public int distanceDriven =0;
    public String distanceDiaplay(){
        return "Distance driven is " + distanceDriven + " meters.";
    }

//  ex3.Display the battery percentage
    public int batteryPercentage = 100;
    public String batteryDisplay(){
        if(batteryPercentage == 0){
            return "Battery is empty";
        }
        return "Battery is at " + batteryPercentage + " %";
    }

    //   ex4 & ex5 Update the number of meters driven and battery percentage when driving
    public void drive(){
        if(batteryPercentage > 0){
            distanceDriven += 20;
            batteryPercentage -=1;
        }
    }

}
