class UPSChild extends UPS {

    void startPower() {
        System.out.println("UPS started with backup");
    }

    void stopPower() {
        System.out.println("UPS stopped safely");
    }

    void chargeBattery() {
        System.out.println("Fast charging enabled");
    }
}