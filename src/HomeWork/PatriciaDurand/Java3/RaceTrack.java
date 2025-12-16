package HomeWork.PatriciaDurand.Java3;

public class RaceTrack {

    public int distance;

//    ex2
    public RaceTrack(int distance){
        this.distance = distance;
    }

//    ex6
    public boolean canFinishRace(NeedForSpeed car){
        while (!car.batteryDrained()){
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
