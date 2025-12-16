package HomeWork.MadalinaSamoila.HomeworkJava3;

public class MainNeedForSpeed {
    public static void main(String[] args) {
        NeedForSpeed car = new NeedForSpeed(5, 2);
        RaceTrack race = new RaceTrack(100);

        System.out.println(race.carCanFinish(car));

        NeedForSpeed nitro = NeedForSpeed.nitro();
        nitro.drive();
        System.out.println(nitro.distanceDriven());
    }
}
