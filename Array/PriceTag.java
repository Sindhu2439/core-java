class PriceTag extends Tag {
    double price;
    String shop;

    PriceTag(String name, int id, double price, String shop) {
        super(name, id);
        this.price = price;
        this.shop = shop;
        System.out.println("PriceTag constructor called");
    }
}