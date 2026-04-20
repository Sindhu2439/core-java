class PuzzleRunner {

    public static void main(String[] args) {

        Puzzle p1 = new Puzzle("Cube", 100);
        Puzzle p2 = new Puzzle("Board", 200);

        GamePuzzle g1 = new GamePuzzle("Cube", 100, "Easy", "Color");
        GamePuzzle g2 = new GamePuzzle("Board", 200, "Hard", "Number");

        SmartPuzzle s1 = new SmartPuzzle("Cube", 100, "Medium", "Shape");
        SmartPuzzle s2 = new SmartPuzzle("Board", 200, "Hard", "Logic");

    }
}