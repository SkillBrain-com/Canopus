package HomeWork.IoanaNegulici.Java3;

public class Fighter {
    // 1. Describe a fighter
    @Override
    public String toString(){
        return "Fighter is a " + this.getClass().getSimpleName();
    }

    // 2. Make fighters not vulnerable by default
    public boolean isVulnerable(){
        return false;
    }

    public int damagePoints(Fighter inamic){
        return 0;
    }

}
