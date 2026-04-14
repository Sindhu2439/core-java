class CupRunner {
    public static void main(String[] args) {
        Cup cup = new Cup();
        cup.save("TeaCup");
        cup.save("CoffeeCup");
        cup.save("GlassCup");
        cup.save("PaperCup");
        cup.save("PlasticCup");
        cup.store("GlassCup");
        cup.store("WoodCup");
    }
}