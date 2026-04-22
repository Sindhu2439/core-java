class VehicleTester {
   void testVehicle(Vehicle vehicle) {
      System.out.println("----------------------");
      vehicle.start();
        if (vehicle instanceof ElectricCar) {
            System.out.println("JVM refers to ElectricCar");
        }
        else if (vehicle instanceof Car) {
            System.out.println("JVM refers to Car");
        }
        else {
            System.out.println("JVM refers to Vehicle");
        }
    }
}