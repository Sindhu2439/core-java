class Hammer {
    String type;
    String brand;
    Worker[] worker;

    Hammer(String type, String brand, Worker[] worker) {
        this.type = type;
        this.brand = brand;
        this.worker = worker;
    }

    void display() {
        System.out.println("Type: " + this.type);
        System.out.println("Brand: " + this.brand);

        System.out.println("Workers");
        if (this.worker != null) {
            for (Worker w : this.worker) {
                w.show();
            }
        }
    }
}