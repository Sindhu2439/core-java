class Boat {
    String name;
    String type;
    Sailor[] sailor;

    Boat(String name, String type, Sailor[] sailor) {
        this.name = name;
        this.type = type;
        this.sailor = sailor;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);

        System.out.println("Sailors");
        if (this.sailor != null) {
            for (Sailor s : this.sailor) {
                s.show();
            }
        }
    }
}

