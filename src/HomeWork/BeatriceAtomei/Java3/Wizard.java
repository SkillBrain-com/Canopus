package HomeWork.BeatriceAtomei.Java3;

public class Wizard extends Fighter{
    private boolean spellPrepared = false;
    public void preparedSpell(){
        spellPrepared = true;
    }
    @Override
    public boolean isVulnerable(){
        return !spellPrepared;
    }
    @Override
    public int damagePoints(Fighter opponent){
        if (spellPrepared){
            return 12;
        }
        return 3;
    }
}
