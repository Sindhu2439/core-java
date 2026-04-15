class Glove {

    String type;
    double size;
    String material;
    boolean isWaterproof;
    int durability;
    double price;
    String color;
    String usage;
    double weight;
    boolean isSmart;

    Glove(String type, double size, String material, boolean isWaterproof, int durability,
          double price, String color, String usage, double weight, boolean isSmart) {

        this.type = type;
        this.size = size;
        this.material = material;
        this.isWaterproof = isWaterproof;
        this.durability = durability;
        this.price = price;
        this.color = color;
        this.usage = usage;
        this.weight = weight;
        this.isSmart = isSmart;
    }

    void show() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Type: " + this.type);
        System.out.println("Size: " + this.size);
        System.out.println("Material: " + this.material);
        System.out.println("Waterproof: " + this.isWaterproof);
        System.out.println("Durability: " + this.durability);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("Usage: " + this.usage);
        System.out.println("Weight: " + this.weight);
        System.out.println("Smart: " + this.isSmart);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}