package inheritance;

public class Wizard {

    String wizardName;
    String magicType;
    int powerLevel;
    int age;

    public String getWizardName() {
        return wizardName;
    }

    public void setWizardName(String wizardName) {
        this.wizardName = wizardName;
    }

    public String getMagicType() {
        return magicType;
    }

    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "wizardName='" + wizardName + '\'' +
                ", magicType='" + magicType + '\'' +
                ", powerLevel=" + powerLevel +
                ", age=" + age +
                '}';
    }
}