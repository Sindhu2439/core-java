class Tissue {

    String brand;
    String type;
    int ply;
    int sheets;
    boolean isSoft;
    double price;
    String color;
    String fragrance;
    double length;
    boolean isBiodegradable;

    Tissue(String brand, String type, int ply, int sheets, boolean isSoft,
           double price, String color, String fragrance, double length, boolean isBiodegradable) {

        this.brand = brand;
        this.type = type;
        this.ply = ply;
        this.sheets = sheets;
        this.isSoft = isSoft;
        this.price = price;
        this.color = color;
        this.fragrance = fragrance;
        this.length = length;
        this.isBiodegradable = isBiodegradable;
    }

    void show() {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Ply: " + this.ply);
        System.out.println("Sheets: " + this.sheets);
        System.out.println("Is Soft: " + this.isSoft);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("Fragrance: " + this.fragrance);
        System.out.println("Length: " + this.length);
        System.out.println("Is Biodegradable: " + this.isBiodegradable);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}