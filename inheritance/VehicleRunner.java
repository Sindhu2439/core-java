class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new ElectricCar();
        VehicleTester tester = new VehicleTester();
        tester.testVehicle(vehicle1);
        tester.testVehicle(vehicle2);
        tester.testVehicle(vehicle3);
    }
}