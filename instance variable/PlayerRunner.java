class PlayerRunner {
    public static void main(String[] args) {

        Game game1 = new Game("Cricket", GameType.OUTDOOR, 100);
        Game game2 = new Game("Chess", GameType.INDOOR, 50);
        Game game3 = new Game("PUBG", GameType.ONLINE, 80);

        Game[] games = {game1, game2, game3};

        Player player = new Player("Sindhu", "RCB", games);

        player.display();
    }
}