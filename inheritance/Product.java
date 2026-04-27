class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Product constructor");
    }

    void showDetails() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class Electronics extends Product {
    String brand;

    Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
        System.out.println("Electronics constructor");
    }

    void warranty() {
        System.out.println(brand + " product has warranty");
    }
}

class Mobile extends Electronics {

    Mobile(String name, double price, String brand) {
        super(name, price, brand);
        System.out.println("Mobile constructor");
    }

    void call() {
        System.out.println(name + " is used for calling");
    }
}

class ProductRunner {
    public static void main(String[] args) {

        Mobile mobile = new Mobile("iPhone", 80000, "Apple");

        mobile.showDetails();
        mobile.warranty();
        mobile.call();
    }
}