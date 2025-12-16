package HomeWork.BeatriceAtomei.Java3;

public class ElonsToyCar {
    public static void main(String[] args) {

       test();


    }

    // ex1
    public static ElonsToyCar buy(){
        return new ElonsToyCar();
    }
    //ex2
    public int distanceDriven = 0;
    public String distanceDisplay(){
        return "Distance driven is " + distanceDriven + "m.";
    }
    // ex3
    public int batteryPercentage = 100;
    public String batteryDisplay(){
        if (batteryPercentage == 0){
            return "Battery is empty";
        }
        return "Battery is at " + batteryPercentage + "%";
    }
    // ex4, ex5
    public void drive(){
        if (batteryPercentage > 0){
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }
  static void test(){
      ElonsToyCar car = ElonsToyCar.buy();

      System.out.println(car.distanceDisplay());
      System.out.println(car.batteryDisplay());

      car.drive();
      System.out.println(car.distanceDisplay());
      System.out.println(car.batteryDisplay());
      car.drive();


      // ex6
      for (int i = 0; i < 100; i++){
          car.drive();
      }

      System.out.println(car.distanceDisplay());
      System.out.println(car.batteryDisplay());

  }


    }



