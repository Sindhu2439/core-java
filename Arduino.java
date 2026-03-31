class Arduino {

    String board;
    String processor;
    int memory;
    int clockSpeed;
    int digitalPins;
    int analogPins;
    boolean hasUSB;
    boolean hasWifi;
    boolean hasBluetooth;
    int price;
    String brand;
    String model;
    int year;
    String country;
    String usage;
    String category;
    String supplier;
    String color;
    int code;
    int stock;
    boolean isAvailable;
    boolean isProgrammable;
    boolean isPortable;
    double voltage;
    double current;
    String warranty;

    Arduino() {
        System.out.println("Arduino constructor");

        board="UNO";
        processor="ATmega328";
        memory=32;
        clockSpeed=16;
        digitalPins=14;
        analogPins=6;
        hasUSB=true;
        hasWifi=false;
        hasBluetooth=false;
        price=800;
        brand="Arduino";
        model="UNO R3";
        year=2023;
        country="Italy";
        usage="Projects";
        category="Electronics";
        supplier="Store";
        color="Blue";
        code=601;
        stock=25;
        isAvailable=true;
        isProgrammable=true;
        isPortable=true;
        voltage=5.0;
        current=2.0;
        warranty="1 year";
    }
}