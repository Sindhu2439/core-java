public class Gadget {
    public static void main(String[] args) {
        String deviceName = "Smartphone";
        String os = "Android";
        int ramGb = 8;
        double batteryLevel = 85.5;
        boolean hasWarranty = true;

        System.out.println("Device: " + deviceName);
        System.out.println("OS: " + os);
        System.out.println("RAM: " + ramGb);
        System.out.println("Battery: " + batteryLevel);
        System.out.println("Warranty: " + hasWarranty);

        deviceName = "Smartwatch";
        os = "WearOS";
        ramGb = 2;
        batteryLevel = 45.0;
        hasWarranty = false;

        System.out.println("Updated Device: " + deviceName);
        System.out.println("Updated OS: " + os);
        System.out.println("Updated RAM: " + ramGb);
        System.out.println("Updated Battery: " + batteryLevel);
        System.out.println("Updated Warranty: " + hasWarranty);
    }
}