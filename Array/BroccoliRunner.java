class BroccoliRunner {

    public static void main(String... args) {

        BroccoliStore store = new BroccoliStore();

        Broccoli broccoli1  = new Broccoli("Calabrese", 0.5, "Green", true, 89, 50.0, "India", true, 10.2, 7);
        Broccoli broccoli2  = new Broccoli("Sprouting", 0.4, "Dark Green", true, 80, 45.0, "USA", true, 9.8, 6);
        Broccoli broccoli3  = new Broccoli("Romanesco", 0.6, "Light Green", false, 95, 60.0, "Italy", true, 11.0, 5);
        Broccoli broccoli4  = new Broccoli("Chinese", 0.3, "Green", true, 70, 40.0, "China", true, 8.5, 6);
        Broccoli broccoli5  = new Broccoli("Broccolini", 0.2, "Green", true, 85, 55.0, "Japan", true, 7.5, 5);
        Broccoli broccoli6  = new Broccoli("Calabrese-X", 0.55, "Green", true, 92, 52.0, "India", true, 10.5, 7);
        Broccoli broccoli7  = new Broccoli("Sprouting-X", 0.45, "Dark Green", true, 88, 48.0, "USA", true, 9.2, 6);
        Broccoli broccoli8  = new Broccoli("Romanesco-X", 0.65, "Light Green", false, 97, 65.0, "Italy", true, 11.5, 5);
        Broccoli broccoli9  = new Broccoli("Chinese-X", 0.35, "Green", true, 75, 42.0, "China", true, 8.7, 6);
        Broccoli broccoli10 = new Broccoli("Broccolini-X", 0.25, "Green", true, 90, 58.0, "Japan", true, 7.8, 5);
        Broccoli broccoli11 = new Broccoli("Hybrid1", 0.5, "Green", true, 88, 50.0, "India", true, 10.1, 7);
        Broccoli broccoli12 = new Broccoli("Hybrid2", 0.45, "Dark Green", true, 84, 47.0, "USA", true, 9.6, 6);
        Broccoli broccoli13 = new Broccoli("Hybrid3", 0.55, "Green", true, 91, 53.0, "Italy", true, 10.8, 7);
        Broccoli broccoli14 = new Broccoli("Hybrid4", 0.4, "Green", true, 78, 44.0, "China", true, 8.9, 6);
        Broccoli broccoli15 = new Broccoli("Hybrid5", 0.3, "Green", true, 82, 49.0, "Japan", true, 7.6, 5);
        Broccoli broccoli16 = new Broccoli("Hybrid6", 0.6, "Green", true, 95, 62.0, "India", true, 11.2, 7);
        Broccoli broccoli17 = new Broccoli("Hybrid7", 0.5, "Dark Green", true, 90, 51.0, "USA", true, 10.0, 7);
        Broccoli broccoli18 = new Broccoli("Hybrid8", 0.45, "Light Green", false, 86, 46.0, "Italy", true, 9.4, 6);
        Broccoli broccoli19 = new Broccoli("Hybrid9", 0.35, "Green", true, 79, 43.0, "China", true, 8.3, 6);
        Broccoli broccoli20 = new Broccoli("Hybrid10", 0.25, "Green", true, 93, 59.0, "Japan", true, 7.9, 5);

        store.store(broccoli1);
        store.store(broccoli2);
        store.store(broccoli3);
        store.store(broccoli4);
        store.store(broccoli5);
        store.store(broccoli6);
        store.store(broccoli7);
        store.store(broccoli8);
        store.store(broccoli9);
        store.store(broccoli10);
        store.store(broccoli11);
        store.store(broccoli12);
        store.store(broccoli13);
        store.store(broccoli14);
        store.store(broccoli15);
        store.store(broccoli16);
        store.store(broccoli17);
        store.store(broccoli18);
        store.store(broccoli19);
        store.store(broccoli20);

        store.update(broccoli5, new Broccoli("BROCCOLI-NEW", 0.28, "Green", true, 99, 70.0, "India", true, 7.2, 8));
        store.update(broccoli17, new Broccoli("BROCCOLI-X", 0.52, "Dark Green", true, 98, 68.0, "USA", true, 10.3, 8));

        store.display();
    }
}