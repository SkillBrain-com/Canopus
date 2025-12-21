package HomeWork.IoanaNegulici.Java3;

public class Wizard extends Fighter {
    public boolean spellPrepared = false;

    // 3. Allow Wizards to prepare a spell
    public void prepareSpell(){
        spellPrepared = true;
    }

    //  4.Make Wizards vulnerable when not having prepared a spell
    @Override
    public boolean isVulnerable(){
        return !spellPrepared;
    }

    // 5. Calculate the damage points for a Wizard
    @Override
    public int damagePoints(Fighter inamic){
        if (!spellPrepared){
            return 12;
        }
        return 3;
    }



}
