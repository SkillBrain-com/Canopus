package HomeWork.PatriciaDurand.Java3;

import HomeWork.MadalinaSamoila.HomeworkJava3.Fighter;

public class WizardsAndWarriors {

    public static void main(String[] args) {

//        ex1
        Fighter warrior = new Warrior();
        Fighter wizard = new Wizard();
        System.out.println(warrior.toString());
        System.out.println(wizard.toString());
//        ex2
        System.out.println("Are fighters vulnerable? " +warrior.isVulnerable());
//        ex3
        Wizard wizard1 = new Wizard();
        wizard1.prepareSpell();
        System.out.println("Wizard prepared a spell");
//        ex4
        System.out.println("Wizard is vulnerable? " + wizard.isVulnerable());
//        ex5
        int damageFromWizard1 = wizard1.damagePoints(warrior);
        Wizard wizard2 = new Wizard();
        int damageFromWizard2 = wizard2.damagePoints(warrior);
        System.out.println("Wizard1 damage: " +damageFromWizard1 );
        System.out.println("Wizard2 damage: " +damageFromWizard2);
//        ex6
        int damageToWizard1 = warrior.damagePoints(wizard1);
        int damageToWizard2 = warrior.damagePoints(wizard2);
        System.out.println("Warrior hits wizard1 when not vulnerable: " + damageToWizard1);
        System.out.println("Warrior hits wizard2 when vulnerable: " + damageToWizard2);
    }
}
