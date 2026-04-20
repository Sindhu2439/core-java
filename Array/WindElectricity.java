class WindElectricity extends Electricity {
    double turbineHeight;
    double windSpeed;
 
    WindElectricity(String source, double voltage, double turbineHeight, double windSpeed) {
        super(source, voltage);
        this.turbineHeight = turbineHeight;
        this.windSpeed = windSpeed;
        System.out.println("WindElectricity constructor called");
    }
 
    void show() {
        super.show();
        System.out.println("Turbine Height: " + turbineHeight + "m, Wind Speed: " + windSpeed);
    }
}