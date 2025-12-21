package HomeWork.IoanaNegulici.Java3;

public class FighterAndWizard {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Wizard  wizard = new Wizard();
        Warrior warrior = new Warrior();


        System.out.println(wizard.toString());
        System.out.println(warrior.toString());
        wizard.prepareSpell();


        System.out.println("The highter is vulnerable? " + fighter.isVulnerable());
        System.out.println("The wizard is vulnerable? " + wizard.isVulnerable());
        System.out.println("The warrior is vulnerable? " + warrior.isVulnerable());

        System.out.println("Warrior demage points  are: " + warrior.damagePoints(warrior));
        System.out.println("Warrior demage points  are: " + wizard.damagePoints(wizard));

    }
}
