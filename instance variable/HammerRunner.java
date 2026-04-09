class HammerRunner {
    public static void main(String[] args) {

        Worker w1 = new Worker("Sindhu", HammerType.CLAW, 2);
        Worker w2 = new Worker("Puneeth", HammerType.SLEDGE, 5);
        Worker w3 = new Worker("Rahul", HammerType.BALLPEEN, 3);

        Worker[] workers = {w1, w2, w3};

        Hammer hammer = new Hammer("Steel", "Bosch", workers);

        hammer.display();
    }
}