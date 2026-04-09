class Sailor {
    String name;
    BoatType boattype;
    int experience;

    Sailor(String name, BoatType boattype, int experience) {
        this.name = name;
        this.boattype = boattype;
        this.experience = experience;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("BoatType: " + this.boattype);
        System.out.println("Experience: " + this.experience);
        System.out.println();
    }
}