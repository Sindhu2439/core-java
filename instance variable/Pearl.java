class Pearl {
    String type;
    String color;
    Oyster[] oyster;

    Pearl(String type, String color, Oyster[] oyster) {
        this.type = type;
        this.color = color;
        this.oyster = oyster;
    }

    void display() {
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);

        System.out.println("Oysters");
        if (this.oyster != null) {
            for (Oyster o : this.oyster) {
                o.show();
            }
        }
    }
}
