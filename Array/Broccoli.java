class Broccoli {

    String variety;
    double weight;
    String color;
    boolean isOrganic;
    int vitaminC;
    double price;
    String origin;
    boolean isFresh;
    double diameter;
    int shelfLifeDays;

    Broccoli(String variety, double weight, String color, boolean isOrganic,
             int vitaminC, double price, String origin, boolean isFresh,
             double diameter, int shelfLifeDays) {

        this.variety = variety;
        this.weight = weight;
        this.color = color;
        this.isOrganic = isOrganic;
        this.vitaminC = vitaminC;
        this.price = price;
        this.origin = origin;
        this.isFresh = isFresh;
        this.diameter = diameter;
        this.shelfLifeDays = shelfLifeDays;
    }

    void show() {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Variety: " + this.variety);
        System.out.println("Weight: " + this.weight);
        System.out.println("Color: " + this.color);
        System.out.println("Organic: " + this.isOrganic);
        System.out.println("Vitamin C: " + this.vitaminC);
        System.out.println("Price: " + this.price);
        System.out.println("Origin: " + this.origin);
        System.out.println("Fresh: " + this.isFresh);
        System.out.println("Diameter: " + this.diameter);
        System.out.println("Shelf Life (days): " + this.shelfLifeDays);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}