class PowerPlant {

    String companyName;   
    int numberOfPanels;   

    SolarPanel solarPanel; 
    PanelType type;        

    PowerPlant(String companyName, int numberOfPanels) {
        this.companyName = companyName;
        this.numberOfPanels = numberOfPanels;
    }

    void show() {

        System.out.println("Company Name: " + this.companyName);
        System.out.println("Number Of Panels: " + this.numberOfPanels);
        System.out.println("Panel Type: " + this.type);

        if (solarPanel != null) {
            solarPanel.details();
        } 
        else {
            System.out.println("SolarPanel is null");
        }
    }
}