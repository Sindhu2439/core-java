class Monitor {

    String brand;
    String model;
    String type;
    double screenSize;
    String resolution;
    int refreshRate;
    int price;
    String color;
    double weight;
    boolean isCurved;
    boolean hasHDMI;
    boolean hasVGA;
    boolean hasUSB;
    int usbPorts;
    int hdmiPorts;
    String panelType;
    String country;
    int year;
    String usage;
    String category;
    String supplier;
    boolean isTouch;
    boolean isPortable;
    int warranty;
    String design;
    boolean isAvailable;

    Monitor() {
        System.out.println("Monitor constructor");

        brand="LG";
        model="M24";
        type="LED";
        screenSize=24;
        resolution="Full HD";
        refreshRate=75;
        price=12000;
        color="Black";
        weight=3.5;
        isCurved=false;
        hasHDMI=true;
        hasVGA=true;
        hasUSB=true;
        usbPorts=2;
        hdmiPorts=1;
        panelType="IPS";
        country="Korea";
        year=2023;
        usage="Office";
        category="Electronics";
        supplier="Store";
        isTouch=false;
        isPortable=false;
        warranty=2;
        design="Slim";
        isAvailable=true;
    }
}