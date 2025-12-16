package HomeWork.PatriciaDurand.Java3;

import HomeWork.MadalinaSamoila.HomeworkJava3.Fighter;

public class Warrior extends Fighter {

//    ex6 Calculate the damage points for a Warrior
    public int damagePoints(Fighter opponent){
        if(opponent.isVulnerable()){
            return 10;
        }else{
            return 6;
        }
    }
}
