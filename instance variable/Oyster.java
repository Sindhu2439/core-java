class Oyster {
    String name;
    PearlType pearltype;
    int weight;

    Oyster(String name, PearlType pearltype, int weight) {
        this.name = name;
        this.pearltype = pearltype;
        this.weight = weight;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("PearlType: " + this.pearltype);
        System.out.println("Weight: " + this.weight);
        System.out.println();
    }
}
