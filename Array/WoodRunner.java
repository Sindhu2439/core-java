class WoodRunner {

    public static void main(String[] args) {

        Wood w1 = new Wood("Teak", 10);
        Wood w2 = new Wood("Oak", 12);

        FurnitureWood f1 = new FurnitureWood("Teak", 10, "Chair", "High");
        FurnitureWood f2 = new FurnitureWood("Oak", 12, "Table", "Medium");

        SmartWood s1 = new SmartWood("Teak", 10, "Bed", "Premium");
        SmartWood s2 = new SmartWood("Oak", 12, "Door", "Standard");

    }
}