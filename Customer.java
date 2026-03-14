class Customer {

    static void address() {
        System.out.println("Customer address method");
        Address.info();
    }

    public static void main(String[] args) {
        address();
    }
}

class Address {

    static void info() {
        System.out.println("Address info");
        Street.details();
    }

    static void pincode() {
        System.out.println("Pincode is 560067");
    }
}

class Street {

    static void details() {
        System.out.println("Street details");
        Address.pincode();
    }
}