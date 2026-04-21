class Restaurant {
    String name;
    String city;

    Restaurant() {
        this("Default", "Unknown");
        System.out.println("Default constructor");
    }

    Restaurant(String name, String city) {
        this.name = name;
        this.city = city;
        System.out.println("Parameterized constructor");
    }
}