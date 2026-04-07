class SolarPanelRunner {

    public static void main(String... args) {

        PowerPlant plant = new PowerPlant("Adani Solar", 200);

        plant.solarPanel = new SolarPanel();
        plant.solarPanel.capacity = 500;
        plant.solarPanel.location = "Rajasthan";

        plant.type = PanelType.MONOCRYSTALLINE;

        plant.show();
    }
}