class LaptopTouchPad extends TouchPad {
    String laptopName;
    double sensitivity;

    LaptopTouchPad(String brand, int size, String laptopName, double sensitivity) {
        super(brand, size);
        this.laptopName = laptopName;
        this.sensitivity = sensitivity;
        System.out.println("LaptopTouchPad constructor called");
    }
}