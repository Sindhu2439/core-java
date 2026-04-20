class SolarElectricity extends Electricity {
    int numberOfPanels;
    double panelEfficiency;
 
    SolarElectricity(String source, double voltage, int numberOfPanels, double panelEfficiency) {
        super(source, voltage);
        this.numberOfPanels = numberOfPanels;
        this.panelEfficiency = panelEfficiency;
        System.out.println("SolarElectricity constructor called");
    }
 
    void show() {
        super.show();
        System.out.println("Panels: " + numberOfPanels + ", Efficiency: " + panelEfficiency + "%");
    }
}