package HomeworkJava3;

public class MainWizardWarior {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        System.out.println(warrior);
        System.out.println(wizard);
        System.out.println(wizard.isVulnerable());

        wizard.prepareSpell();
        System.out.println(wizard.isVulnerable());

        System.out.println(wizard.damagePoints(warrior));
        System.out.println(warrior.damagePoints(wizard));
    }
}
