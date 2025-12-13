package HomeWork.BeatriceAtomei.Java3;

public class RaceTrack {
    public int distance;
    public RaceTrack(int distance){
        this.distance = distance;
    }
    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
