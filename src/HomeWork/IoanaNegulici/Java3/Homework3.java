package HomeWork.IoanaNegulici.Java3;

public class Homework3 {
    public static void main(String[] args) {
        int[] birds = {0, 2, 5, 3, 7, 8, 4};
        getLastWeek(birds);
        System.out.println("=======================================================");
        System.out.println(getToday(birds));
        System.out.println("=======================================================");
        int todayIncrement = incrementDay(birds);
        System.out.println(todayIncrement);
        System.out.println("=======================================================");
        boolean daysWithoutBird = hasDayWithoutBirds(birds);
        System.out.println(daysWithoutBird);
        System.out.println("=======================================================");
        int firstDays = getCountForFirstDays(birds, 4);
        System.out.println(firstDays);
        System.out.println("=======================================================");
        int busyDays = getBusyDays(birds);
        System.out.println("Number of busy days are " + busyDays);
    }

    // 1. Check what the counts were last week
    static void getLastWeek(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    //2. Check how many birds visited today
    static int getToday(int[] array) {
        int lastDay = array[array.length - 1];
        return lastDay;
    }

    //3. Increment today's count
    static int incrementDay(int[] array) {
        int today = getToday(array);
        today++;
        return today;
    }

    //4. Check if there was a day with no visiting birds
    static boolean hasDayWithoutBirds(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // 5. Calculate the number of visiting birds for the first number of days
    static int getCountForFirstDays(int[] array, int days) {
        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum = sum + array[i];

        }
        return sum;
    }

    // 6. Calculate the number of busy days
    static int getBusyDays(int[] array) {
        int busyDays = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

}
