class ThinkPad {

    String brand;
    String model;
    String processor;
    int ram;
    int storage;
    double price;
    String color;
    String operatingSystem;
    double screenSize;
    boolean fingerprint;

    ThinkPad(String brand, String model, String processor, int ram, int storage,
             double price, String color, String operatingSystem, double screenSize, boolean fingerprint) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.fingerprint = fingerprint;
    }

    void show() {

        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Processor: " + this.processor);
        System.out.println("Ram: " + this.ram);
        System.out.println("Storage: " + this.storage);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("OperatingSystem: " + this.operatingSystem);
        System.out.println("ScreenSize: " + this.screenSize);
        System.out.println("Fingerprint: " + this.fingerprint);

    }
}