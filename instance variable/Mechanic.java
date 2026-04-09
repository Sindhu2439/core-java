class Mechanic {
    String name;
    StarterType startertype;
    int experience;

    Mechanic(String name, StarterType startertype, int experience) {
        this.name = name;
        this.startertype = startertype;
        this.experience = experience;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("StarterType: " + this.startertype);
        System.out.println("Experience: " + this.experience);
        System.out.println();
    }
}
