package HomeWork.MadalinaSamoila.HomeworkJava3;
//Ex2
public class RaceTrack {

    private final int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }
//Ex6

    public boolean carCanFinish(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
            if (car.distanceDriven() >= distance) {
                return true;
            }
        }
        return car.distanceDriven() >= distance;
    }


}
