class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor");
    }

    void start() {
        System.out.println(brand + " is starting");
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
        System.out.println("Car constructor");
    }

    void drive() {
        System.out.println(brand + " " + model + " is driving");
    }
}

class ElectricCar extends Car {

    ElectricCar(String brand, String model) {
        super(brand, model);
        System.out.println("ElectricCar constructor");
    }

    void charge() {
        System.out.println(brand + " " + model + " is charging");
    }
}

class VehicleRunner {
    public static void main(String[] args) {

        ElectricCar car = new ElectricCar("Tesla", "Model3");

        car.start();
        car.drive();
        car.charge();
    }
}