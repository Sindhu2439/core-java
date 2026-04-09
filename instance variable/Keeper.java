class Keeper {
    String name;
    LightHouseType lhtype;
    int experience;

    Keeper(String name, LightHouseType lhtype, int experience) {
        this.name = name;
        this.lhtype = lhtype;
        this.experience = experience;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("LightHouseType: " + this.lhtype);
        System.out.println("Experience: " + this.experience);
        System.out.println();
    }
}