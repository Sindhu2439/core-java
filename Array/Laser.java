class Laser {

    String brand;
    String type;
    double power;
    String wavelength;
    int range;
    double price;
    String color;
    boolean isPortable;
    String material;
    boolean isMilitaryGrade;

    Laser(String brand, String type, double power, String wavelength, int range,
          double price, String color, boolean isPortable, String material, boolean isMilitaryGrade) {

        this.brand = brand;
        this.type = type;
        this.power = power;
        this.wavelength = wavelength;
        this.range = range;
        this.price = price;
        this.color = color;
        this.isPortable = isPortable;
        this.material = material;
        this.isMilitaryGrade = isMilitaryGrade;
    }

    void show() {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Power: " + this.power);
        System.out.println("Wavelength: " + this.wavelength);
        System.out.println("Range: " + this.range);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("Is Portable: " + this.isPortable);
        System.out.println("Material: " + this.material);
        System.out.println("Is Military Grade: " + this.isMilitaryGrade);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}