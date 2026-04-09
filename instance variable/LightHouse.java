class LightHouse {
    String name;
    String location;
    Keeper[] keeper;

    LightHouse(String name, String location, Keeper[] keeper) {
        this.name = name;
        this.location = location;
        this.keeper = keeper;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Location: " + this.location);

        System.out.println("Keepers");
        if (this.keeper != null) {
            for (Keeper k : this.keeper) {
                k.show();
            }
        }
    }
}