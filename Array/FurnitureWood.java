class FurnitureWood extends Wood {
    String usage;
    String quality;

    FurnitureWood(String type, int length, String usage, String quality) {
        super(type, length);
        this.usage = usage;
        this.quality = quality;
        System.out.println("FurnitureWood constructor called");
    }
}