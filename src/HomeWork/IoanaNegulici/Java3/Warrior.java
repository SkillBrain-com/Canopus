package HomeWork.IoanaNegulici.Java3;

public class Warrior extends Fighter{

    // 6. Calculate the damage points for a Warrior
 @Override
    public int damagePoints(Fighter inamic){
    if(inamic.isVulnerable()){
        return 10;
        }
    return 6;
    }
}
