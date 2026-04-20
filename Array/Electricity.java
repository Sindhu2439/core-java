class Electricity {
    String source;
    double voltage;
 
    Electricity(String source, double voltage) {
        this.source = source;
        this.voltage = voltage;
        System.out.println("Electricity constructor called");
    }
 
    void show() {
        System.out.println("Source: " + source + ", Voltage: " + voltage);
    }
}