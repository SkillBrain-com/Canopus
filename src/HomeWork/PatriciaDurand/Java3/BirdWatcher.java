package HomeWork.PatriciaDurand.Java3;

public class BirdWatcher {

    public static void main(String[] args) {

    int[] birds = {0, 2, 5, 3, 7, 8, 4};
        getLastWeek(birds);

    int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
    System.out.println(getToday(birdsPerDay));

        int incrementedToday = incrementToday(birdsPerDay);
        System.out.println(incrementedToday);

        boolean daysWithoutBirds = hasDaysWithoutBirds(birdsPerDay);
        System.out.println(daysWithoutBirds);

    int firstDays = getCountForFirstDays(birdsPerDay, 3);
        System.out.println("Sum of the first days = "+ firstDays);

        int busyDays = getBusyDays(birdsPerDay);
        System.out.println("Number of busy days: "+ busyDays);
    }


//  ex1.Check what the counts were last week
    static void getLastWeek(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
}

//   ex2.Check how many birds visited today
    static int getToday(int[] array) {
    int lastDay = array[array.length - 1];
    return lastDay;
}

//  ex3.Increment today's count
    static int incrementToday(int[] array){
        int today = getToday(array);
        today++;
        return today;
    }

//  ex4.Check if there was a day with no visiting birds
    static boolean hasDaysWithoutBirds(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return true;

            }

        }
        return false;
    }

//  ex5.Calculate the number of visiting birds for the first number of days
    static int getCountForFirstDays(int[] array, int days){
        int sum= 0;
        for (int i = 0; i < days; i++) {

            sum= sum + array[i];
        }
        return sum;
    }

//  ex6.Calculate the number of busy days
    static int getBusyDays(int[] array){
        int busyDays = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >=5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}



