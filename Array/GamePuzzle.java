class GamePuzzle extends Puzzle {
    String level;
    String theme;

    GamePuzzle(String type, int pieces, String level, String theme) {
        super(type, pieces);
        this.level = level;
        this.theme = theme;
        System.out.println("GamePuzzle constructor called");
    }
}