class Locket {

    String brand;
    String color;
    String material;
    double price;
    double weight;
    String shape;
    String design;
    String size;
    String origin;
    boolean goldPlated;

    Locket(String brand, String color, String material, double price, double weight,
           String shape, String design, String size, String origin, boolean goldPlated) {

        this.brand = brand;
        this.color = color;
        this.material = material;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.design = design;
        this.size = size;
        this.origin = origin;
        this.goldPlated = goldPlated;
    }

    void show() {

        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Material: " + this.material);
        System.out.println("Price: " + this.price);
        System.out.println("Weight: " + this.weight);
        System.out.println("Shape: " + this.shape);
        System.out.println("Design: " + this.design);
        System.out.println("Size: " + this.size);
        System.out.println("Origin: " + this.origin);
        System.out.println("GoldPlated: " + this.goldPlated);

    }
}