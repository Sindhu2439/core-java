class SmartCamera extends DigitalCamera {
    SmartCamera(String brand, int pixels, String lens, boolean flash) {
        super(brand, pixels, lens, flash);
        System.out.println("SmartCamera");
    }
}