class Engine {

    String type;
    String brand;
    String model;
    String fuelType;
    String country;
    int power;
    int weight;
    int year;
    int code;
    int stock;
    boolean isAutomatic;
    boolean isRunning;
    boolean isAvailable;
    boolean isElectric;
    int cylinders;
    int torque;
    int rpm;
    double capacity;
    String coolingType;
    String usage;
    String quality;
    String category;
    String supplier;
    String color;
    String warranty;
    boolean isTurbo;

    Engine() {
        System.out.println("Engine constructor");

        type="Petrol";
        brand="Honda";
        model="E100";
        fuelType="Petrol";
        country="Japan";
        power=1500;
        weight=200;
        year=2020;
        code=401;
        stock=5;
        isAutomatic=true;
        isRunning=false;
        isAvailable=true;
        isElectric=false;
        cylinders=4;
        torque=300;
        rpm=6000;
        capacity=2.0;
        coolingType="Air";
        usage="Car";
        quality="High";
        category="Automobile";
        supplier="Dealer";
        color="Silver";
        warranty="2 years";
        isTurbo=true;
    }
}