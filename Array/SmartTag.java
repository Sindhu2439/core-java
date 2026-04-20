class SmartTag extends PriceTag {
    SmartTag(String name, int id, double price, String shop) {
        super(name, id, price, shop);
        System.out.println("SmartTag constructor called");
    }
}