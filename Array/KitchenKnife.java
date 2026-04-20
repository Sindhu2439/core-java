class KitchenKnife extends Knife {
    String material;
    String brand;

    KitchenKnife(String type, int size, String material, String brand) {
        super(type, size);
        this.material = material;
        this.brand = brand;
        System.out.println("KitchenKnife constructor called");
    }
}