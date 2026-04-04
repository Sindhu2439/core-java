class LocketRunner {

    public static void main(String[] args) {

        Locket locket1 = new Locket("Tanishq", "Gold", "Gold", 15000, 10,
                "Heart", "Flower", "Small", "India", true);

        Locket locket2 = new Locket("Malabar", "Silver", "Silver", 5000, 8,
                "Oval", "Leaf", "Medium", "India", false);

        Locket locket3 = new Locket("Kalyan", "RoseGold", "Gold", 12000, 9,
                "Round", "Stone", "Small", "Dubai", true);

        locket1.show();
        locket2.show();
        locket3.show();
    }
}