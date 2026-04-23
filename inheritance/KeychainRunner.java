class KeychainRunner {
    public static void main(String[] args) {
        CarKeychain carKeychain = new CarKeychain();
        carKeychain.holdKeys();
        carKeychain.carDesign();
        BikeKeychain bikeKeychain = new BikeKeychain();
        bikeKeychain.holdKeys();
        bikeKeychain.bikeDesign();
        HouseKeychain houseKeychain = new HouseKeychain();
        houseKeychain.holdKeys();
        houseKeychain.houseDesign();
    }
}