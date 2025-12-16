package HomeWork.PatriciaDurand.Java2;

public class Lasagna {

    public static void main(String[] args) {
        Lasagna homeLasagna = new Lasagna();
        int expectedMinutes = homeLasagna.expectedMinutesInOven();
        int remainingMinutes = homeLasagna.remainingMinutesInOven(30);
        int preparationTime = homeLasagna.preparationTimeInMinutes(2);
        int totalTimeInMinutes = homeLasagna.totalTimeInMinutes(4,expectedMinutes);

        System.out.println("Expected minutes in oven = " + expectedMinutes);
        System.out.println("Remaining minutes in oven = " + remainingMinutes);
        System.out.println("Preparation time in minutes for 2 layers is = " + preparationTime);
        System.out.println("Total working time in minutes = " + totalTimeInMinutes);
    }

    int totalTimeInMinutes(int preparationTimeMinutes, int expectedMinutesInOven){
        return preparationTimeMinutes + expectedMinutesInOven;
    }

    int preparationTimeInMinutes(int layers){
        return 2 * layers;
    }

    public int expectedMinutesInOven() {
        return 40;
    }

    int remainingMinutesInOven(int minutesInOven){
        return expectedMinutesInOven() - minutesInOven;
    }


}
