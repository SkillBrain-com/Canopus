package HomeWork.PatriciaDurand.Java3;

public abstract class Fighter {

//    ex1 Describe a fighter
    public String toString(){
        return "Fighter is a "+ this.getClass().getSimpleName();
    }

//    ex2 Make fighters not vulnerable by default
    public boolean isVulnerable(){
        return false;
    }

    public abstract int damagePoints(Fighter opponent);
}
