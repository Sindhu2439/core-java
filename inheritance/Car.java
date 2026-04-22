class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }

    @Override
    void start() {
        System.out.println("Running start in Car");
    }
}