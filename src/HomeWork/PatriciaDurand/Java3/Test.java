package HomeWork.PatriciaDurand.Java3;

public class Test {
    public static void main(String[] args) {
//       ex1.Creating a remote controlled car
        NeedForSpeed car = new NeedForSpeed(5,2);
//       ex2.Creating a race track
        RaceTrack track = new RaceTrack(800);
        System.out.println("Track created with the length of: " + track.distance + "m");

//       ex3.Drive the car
        car.drive();
        System.out.println("Distance driven after one drive: " + car.distanceDriven());

//       ex4.Check for a drained battery
        System.out.println("Is the battery drained? " + car.batteryDrained());

//       ex5.Create the Nitro remote control car
        car = NeedForSpeed.nitro();
        car.drive();
        System.out.println("Distance driven by nitro car after one drive is " + car.distanceDriven());

//       ex6.Check if a remote control car can finish a race
        car = new NeedForSpeed(5,2);
        track = new RaceTrack(100);
        System.out.println("Can the car finish the 100m race? " + track.canFinishRace(car));

    }
}
