package HomeWork.BeatriceAtomei.Java3;

public class testww {
    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        Fighter wizard = new Wizard();

        System.out.println(warrior);
        System.out.println(wizard);

        System.out.println(wizard.isVulnerable());

        ((Wizard) wizard).preparedSpell();
        System.out.println(wizard.isVulnerable());

        System.out.println(warrior.damagePoints(wizard));
        System.out.println(wizard.damagePoints(warrior));




    }
}
