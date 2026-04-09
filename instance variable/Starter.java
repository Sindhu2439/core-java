class Starter {
    String type;
    String brand;
    Mechanic[] mechanic;

    Starter(String type, String brand, Mechanic[] mechanic) {
        this.type = type;
        this.brand = brand;
        this.mechanic = mechanic;
    }

    void display() {
        System.out.println("Type: " + this.type);
        System.out.println("Brand: " + this.brand);

        System.out.println("Mechanics");
        if (this.mechanic != null) {
            for (Mechanic m : this.mechanic) {
                m.show();
            }
        }
    }
}

