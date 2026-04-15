class Silencer {

    String brand;
    double length;
    String material;
    boolean isStainless;
    int noiseReductionLevel;
    double price;
    String type;
    String origin;
    double diameter;
    boolean isLegal;

    Silencer(String brand, double length, String material, boolean isStainless,
             int noiseReductionLevel, double price, String type, String origin,
             double diameter, boolean isLegal) {

        this.brand = brand;
        this.length = length;
        this.material = material;
        this.isStainless = isStainless;
        this.noiseReductionLevel = noiseReductionLevel;
        this.price = price;
        this.type = type;
        this.origin = origin;
        this.diameter = diameter;
        this.isLegal = isLegal;
    }

    void show() {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Brand: " + this.brand);
        System.out.println("Length: " + this.length);
        System.out.println("Material: " + this.material);
        System.out.println("Is Stainless: " + this.isStainless);
        System.out.println("Noise Reduction Level: " + this.noiseReductionLevel);
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
        System.out.println("Origin: " + this.origin);
        System.out.println("Diameter: " + this.diameter);
        System.out.println("Is Legal: " + this.isLegal);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}