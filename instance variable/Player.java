class Player {
    String name;
    String team;
    Game[] game;

    Player(String name, String team, Game[] game) {
        this.name = name;
        this.team = team;
        this.game = game;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Team: " + this.team);

        System.out.println("Games");
        if (this.game != null) {
            for (Game g : this.game) {
                g.show();
            }
        }
    }
}