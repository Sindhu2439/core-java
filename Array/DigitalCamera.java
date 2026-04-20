class DigitalCamera extends Camera {
    String lens;
    boolean flash;

    DigitalCamera(String brand, int pixels, String lens, boolean flash) {
        super(brand, pixels);
        this.lens = lens;
        this.flash = flash;
        System.out.println("DigitalCamera");
    }
}