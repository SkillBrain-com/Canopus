package HomeWork.BeatriceAtomei.Java3;

public class Fighter {
    public boolean isVulnerable(){
        return false;
    }
    public int damagePoints(Fighter opponent){
        return 0;
    }
    @Override
    public String toString(){
        return "Fighter is a " + this.getClass().getSimpleName();
    }

}
