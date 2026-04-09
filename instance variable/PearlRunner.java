class PearlRunner {
    public static void main(String[] args) {

        Oyster o1 = new Oyster("Oyster1", PearlType.NATURAL, 10);
        Oyster o2 = new Oyster("Oyster2", PearlType.CULTURED, 15);
        Oyster o3 = new Oyster("Oyster3", PearlType.FRESHWATER, 12);

        Oyster[] oysters = {o1, o2, o3};

        Pearl pearl = new Pearl("Round", "White", oysters);

        pearl.display();
    }
}