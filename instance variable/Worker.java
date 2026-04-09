class Worker {
    String name;
    HammerType hammertype;
    int experience;

    Worker(String name, HammerType hammertype, int experience) {
        this.name = name;
        this.hammertype = hammertype;
        this.experience = experience;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("HammerType: " + this.hammertype);
        System.out.println("Experience: " + this.experience);
        System.out.println();
    }
}
