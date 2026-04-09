class Game {
    String gameName;
    GameType gametype;
    int score;

    Game(String gameName, GameType gametype, int score) {
        this.gameName = gameName;
        this.gametype = gametype;
        this.score = score;
    }

    void show() {
        System.out.println("Game Name: " + this.gameName);
        System.out.println("GameType: " + this.gametype);
        System.out.println("Score: " + this.score);
        System.out.println();
    }
}
