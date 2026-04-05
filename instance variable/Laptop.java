class Laptop {

    String brand;
    String model;
    String processor;
    int ram;
    int storage;
    double price;
    String color;
    String os;
    double screenSize;
    boolean fingerprint;

    Laptop(String brand, String model, String processor, int ram, int storage,
           double price, String color, String os, double screenSize, boolean fingerprint) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.color = color;
        this.os = os;
        this.screenSize = screenSize;
        this.fingerprint = fingerprint;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("OS: " + os);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Fingerprint: " + fingerprint);
    }
}

class LaptopRunner {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Dell", "Inspiron", "i5", 8, 512, 65000, "Black", "Windows", 15.6, true);
        Laptop laptop2 = new Laptop("HP", "Pavilion", "i7", 16, 1024, 85000, "Silver", "Windows", 14.0, true);
        Laptop laptop3 = new Laptop("Lenovo", "IdeaPad", "Ryzen5", 8, 512, 60000, "Grey", "Windows", 15.6, false);

        laptop1.show();
        laptop2.show();
        laptop3.show();
    }
}