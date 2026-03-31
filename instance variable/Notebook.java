class Notebook{
	 
	 
	 String brand;
    String model;
    String processor;
    int ramSize;
    int storageSize;
    String storageType;
    double screenSize;
    String operatingSystem;
    double price;
    String color;
    double weight;
    int batteryCapacity;
    int batteryLife;
    boolean isTouchScreen;
    String graphicsCard;
    int usbPorts;
    int hdmiPorts;
    boolean hasBluetooth;
    boolean hasWifi;
    String keyboardType;
    boolean hasBacklitKeyboard;
    int warrantyYears;
    String manufacturingCountry;
    int releaseYear;
    String cameraQuality;
    boolean hasFingerprintSensor;


   Notebook(){
	System.out.println("Notebook constructor");
	operatingSystem = "Windows 11";
    price = 65000;
    color = "Black";
    weight = 1.8;
    batteryCapacity = 4500;
    batteryLife = 8;
    isTouchScreen = false;
    graphicsCard = "NVIDIA GTX";
    usbPorts = 3;
    hdmiPorts = 1;
    hasBluetooth = true;
    hasWifi = true;
    keyboardType = "QWERTY";
    hasBacklitKeyboard = true;
    warrantyYears = 1;
    manufacturingCountry = "India";
    releaseYear = 2023;
    cameraQuality = "HD";
    hasFingerprintSensor = true;
	   
   }
}