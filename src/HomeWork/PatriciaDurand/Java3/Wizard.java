package HomeWork.PatriciaDurand.Java3;

import HomeWork.MadalinaSamoila.HomeworkJava3.Fighter;

public class Wizard extends Fighter {

//    ex3 Allow Wizards to prepare a spell
    public boolean spellPrepared = false;

    public void prepareSpell(){
        spellPrepared = true;
    }

//    ex4 Make Wizards vulnerable when not having prepared a spell
    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

//    ex5 Calculate the damage points for a Wizard
    public int damagePoints(Fighter opponent){
        if(spellPrepared){
            return 12;
        }else {
            return 3;
        }
    }
}
