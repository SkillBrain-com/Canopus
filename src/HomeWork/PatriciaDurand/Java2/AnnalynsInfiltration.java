package HomeWork.PatriciaDurand.Java2;

public class AnnalynsInfiltration {
    public static void main(String[] args) {
// 1.
        boolean knightIsAwake = true;
        System.out.println("The fast attack can be made: " + AnnalynsInfiltration.canFastAttack(knightIsAwake));
        System.out.println("---------------------");
// 2.
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println("Spy (knight=false, archer=true, prisoner=false): " + AnnalynsInfiltration.canSpy(false,true, false));
        System.out.println("Spy (knight=false, archer=false, prisoner=false): " + AnnalynsInfiltration.canSpy(false,false, false));
        System.out.println("Spy (knight=true, archer=false, prisoner=false): " + AnnalynsInfiltration.canSpy(true,false, false));
        System.out.println("---------------------");
// 3.
        boolean archerAwake = false;
        boolean prisonerAwake = true;
        System.out.println("Signal prisoner archer=false, prisoner=true: " +  AnnalynsInfiltration.canSignalPrisoner(false,true) );
        System.out.println("Signal prisoner archer=true, prisoner=true: " +   AnnalynsInfiltration.canSignalPrisoner(true,true));
        System.out.println("Signal prisoner archer=false, prisoner=false: " +   AnnalynsInfiltration.canSignalPrisoner(false,false));
        System.out.println("---------------------");
// 4.
        System.out.println("Free prisoner (knight=false, archer=false, prisoner=true, dog=false " + AnnalynsInfiltration.canFreePrisoner(false,false,true, false));
        System.out.println("Free prisoner (knight=true, archer=false, prisoner=true, dog=true " + AnnalynsInfiltration.canFreePrisoner(true,false, true, true));
        System.out.println("Free prisoner (knight=false archer=true, prisoner=true, dog=true " + AnnalynsInfiltration.canFreePrisoner(false,true, true, true));
      
    }
//   1.
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }
//   2.
    public static boolean canSpy(boolean knightIsAwake,boolean archerIsAwake,boolean prisonerIsAwake){
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
        }
//   3.
    public static boolean canSignalPrisoner(boolean  archerIsAwake, boolean  prisonerIsAwake){
        return !archerIsAwake && prisonerIsAwake;
    }
//   4.
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake,boolean prisonerIsAwake, boolean petDogisPresent){

        if(petDogisPresent){
            return !archerIsAwake;
        }
        return prisonerIsAwake && !archerIsAwake && !knightIsAwake;

    }
    }

