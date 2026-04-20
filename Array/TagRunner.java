class TagRunner {
    public static void main(String[] args) {
        Tag t1 = new Tag("Basic", 1);
        Tag t2 = new Tag("Normal", 2);

        PriceTag p1 = new PriceTag("Cloth", 10, 500, "Zudio");
        PriceTag p2 = new PriceTag("Shoe", 11, 1500, "Puma");

        SmartTag s1 = new SmartTag("Watch", 20, 3000, "Titan");
        SmartTag s2 = new SmartTag("Bag", 21, 2000, "Skybags");
    }
}