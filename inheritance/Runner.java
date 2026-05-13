package inheritance;

public class Runner {

    public static void main(String[] args) {

        Wizard wizard1 = new Wizard();
        wizard1.setWizardName("Eldorin");
        wizard1.setMagicType("Lightning");
        wizard1.setPowerLevel(95);
        wizard1.setAge(450);

        Wizard wizard2 = new Wizard();
        wizard2.setWizardName("Mystro");
        wizard2.setMagicType("Ice");
        wizard2.setPowerLevel(90);
        wizard2.setAge(380);

        Wizard wizard3 = new Wizard();
        wizard3.setWizardName("Zypher");
        wizard3.setMagicType("Dark");
        wizard3.setPowerLevel(99);
        wizard3.setAge(600);

        System.out.println(wizard1);
        System.out.println(wizard2);
        System.out.println(wizard3);
    }
}