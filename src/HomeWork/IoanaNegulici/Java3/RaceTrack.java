package HomeWork.IoanaNegulici.Java3;

public class RaceTrack {
    static void main() {
        RaceTrack raceTrack = new RaceTrack(800);
        System.out.println(raceTrack.distance);

        System.out.println(raceTrack.carCanFinish());
        System.out.println("The car can finish a race? " + raceTrack.carCanFinish());

    }
    // 2. Creating a race track
    private int distance;
    public RaceTrack(int distance) {
        this.distance = 800;
    }

    // 6. Check if a remote control car can finish a race
    public boolean carCanFinish() {
        needForSpeed car = new needForSpeed(5,2);
        if (car.distanceDriven()>=distance){
            return true;
        }
        return false;
    }



}