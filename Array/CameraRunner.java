class CameraRunner {

    public static void main(String[] args) {

        Camera cam1 = new Camera("Canon", 45000);
        Camera cam2 = new Camera("Nikon", 55000);

        DigitalCamera digi1 = new DigitalCamera("Sony", 65000, 24, "Mirrorless");
        DigitalCamera digi2 = new DigitalCamera("Panasonic", 70000, 30, "DSLR");

        SmartCamera smart1 = new SmartCamera("GoPro", 30000, 12, "Action");
        SmartCamera smart2 = new SmartCamera("DJI", 40000, 16, "Drone");

    }
}