class SmartTouchPad extends LaptopTouchPad {
    SmartTouchPad(String brand, int size, String laptopName, double sensitivity) {
        super(brand, size, laptopName, sensitivity);
        System.out.println("SmartTouchPad constructor called");
    }
}