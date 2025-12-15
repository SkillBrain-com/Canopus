package Java2;

public class AnnalynsInfiltration {

    public static void main(String[] args) {

        System.out.println(AnnalynsInfiltration.canFastAttack(true));


        System.out.println(AnnalynsInfiltration.canSpy(false, true, false));


        System.out.println(AnnalynsInfiltration.canSignalPrisoner(false, true));

        System.out.println(
                AnnalynsInfiltration.canFreePrisoner(false, true, false, false)
        );

    }

    // 1. Fast attack
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    // 2. Spy
    public static boolean canSpy(boolean knightIsAwake,
                                 boolean archerIsAwake,
                                 boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    // 3. Signal prisoner
    public static boolean canSignalPrisoner(boolean archerIsAwake,
                                            boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    // 4. Free prisoner
    public static boolean canFreePrisoner(boolean knightIsAwake,
                                          boolean archerIsAwake,
                                          boolean prisonerIsAwake,
                                          boolean petDogIsPresent) {

        if (petDogIsPresent) {
            // Dog present: only archer must be asleep
            return !archerIsAwake;
        } else {
            // No dog: everyone must be asleep except the prisoner
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }
}
