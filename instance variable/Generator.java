class Generator {

    String brand;
    String model;
    String type;
    String fuelType;
    int power;
    int price;
    int weight;
    int year;
    int code;
    int stock;
    boolean isElectric;
    boolean isPortable;
    boolean isAvailable;
    boolean isAutomatic;
    int capacity;
    int runtime;
    double efficiency;
    String coolingType;
    String country;
    String usage;
    String category;
    String supplier;
    String color;
    String warranty;
    boolean isSilent;
    boolean hasWheels;

    Generator() {
        System.out.println("Generator constructor");

        brand="Honda";
        model="G200";
        type="Portable";
        fuelType="Diesel";
        power=5000;
        price=40000;
        weight=60;
        year=2022;
        code=501;
        stock=3;
        isElectric=false;
        isPortable=true;
        isAvailable=true;
        isAutomatic=true;
        capacity=10;
        runtime=8;
        efficiency=85.5;
        coolingType="Air";
        country="Japan";
        usage="Home";
        category="Power";
        supplier="Dealer";
        color="Red";
        warranty="2 years";
        isSilent=true;
        hasWheels=true;
    }
}