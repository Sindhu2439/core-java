class GymDumbBell extends DumbBell {
    String material;
    int quantity;

    GymDumbBell(int weight, String type, String material, int quantity) {
        super(weight, type);
        this.material = material;
        this.quantity = quantity;
        System.out.println("GymDumbBell constructor called");
    }
}