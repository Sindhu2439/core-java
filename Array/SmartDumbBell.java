class SmartDumbBell extends GymDumbBell {

    SmartDumbBell(int weight, String type, String material, int quantity) {
        super(weight, type, material, quantity);
        System.out.println("SmartDumbBell constructor called");
    }
}