class Country {

    static void run() {
        System.out.println("Country running");
        State.run();
    }

    public static void main(String[] args) {
        run();
    }
}

class State {

    static void run() {
        System.out.println("State running");
        District.run();
    }

    static void taxing() {
        System.out.println("Taxing");
        measure();
    }

    static void measure() {
        System.out.println("Measuring tax");
        collect();
    }

    static void collect() {
        System.out.println("Collecting tax");
        revenue();
    }

    static void revenue() {
        System.out.println("Revenue generated");
        budget();
    }

    static void budget() {
        System.out.println("Budget prepared");
    }
}

class District {

    static void run() {
        System.out.println("District running");
        State.taxing();
    }
}