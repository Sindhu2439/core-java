class ElectricityRunner {
    public static void main(String... args) {
 
        
        SolarElectricity solar1 = new SolarElectricity("Solar", 240.0, 12, 85.5);
        solar1.show();
 
       
        SolarElectricity solar2 = new SolarElectricity("Solar", 220.0, 20, 90.0);
        solar2.show();
 
        
        WindElectricity wind1 = new WindElectricity("Wind", 415.0, 80.0, 60.5);
        wind1.show();
 
        
        WindElectricity wind2 = new WindElectricity("Wind", 380.0, 100.0, 75.0);
        wind2.show();
    }
}