class SilencerRunner {

    public static void main(String... args) {

        SilencerStore store = new SilencerStore();

        Silencer silencer1  = new Silencer("A1", 10.5, "Steel", true, 80, 5000.0, "Pistol", "India", 2.5, true);
        Silencer silencer2  = new Silencer("B2", 11.0, "Aluminium", true, 85, 5200.0, "Rifle", "USA", 2.6, true);
        Silencer silencer3  = new Silencer("C3", 9.5, "Titanium", true, 90, 6000.0, "Pistol", "Germany", 2.4, true);
        Silencer silencer4  = new Silencer("D4", 12.0, "Steel", false, 70, 4500.0, "Shotgun", "India", 2.7, true);
        Silencer silencer5  = new Silencer("E5", 10.0, "Steel", true, 88, 5100.0, "Rifle", "USA", 2.5, true);
        Silencer silencer6  = new Silencer("F6", 11.2, "Carbon", true, 92, 7000.0, "Pistol", "Japan", 2.3, true);
        Silencer silencer7  = new Silencer("G7", 10.8, "Steel", true, 75, 4800.0, "Rifle", "India", 2.6, true);
        Silencer silencer8  = new Silencer("H8", 9.8, "Aluminium", true, 85, 5300.0, "Pistol", "USA", 2.4, true);
        Silencer silencer9  = new Silencer("I9", 12.5, "Steel", false, 78, 4600.0, "Shotgun", "Germany", 2.8, true);
        Silencer silencer10 = new Silencer("J10", 10.3, "Titanium", true, 95, 7500.0, "Rifle", "Japan", 2.5, true);
        Silencer silencer11 = new Silencer("K11", 11.1, "Steel", true, 80, 4900.0, "Pistol", "India", 2.6, true);
        Silencer silencer12 = new Silencer("L12", 10.6, "Carbon", true, 89, 6800.0, "Rifle", "USA", 2.5, true);
        Silencer silencer13 = new Silencer("M13", 9.9, "Steel", true, 84, 5100.0, "Pistol", "Germany", 2.4, true);
        Silencer silencer14 = new Silencer("N14", 12.2, "Aluminium", false, 72, 4400.0, "Shotgun", "India", 2.7, true);
        Silencer silencer15 = new Silencer("O15", 10.4, "Steel", true, 86, 5000.0, "Rifle", "USA", 2.5, true);
        Silencer silencer16 = new Silencer("P16", 11.3, "Titanium", true, 93, 7200.0, "Pistol", "Japan", 2.3, true);
        Silencer silencer17 = new Silencer("Q17", 10.7, "Steel", true, 81, 4950.0, "Rifle", "India", 2.6, true);
        Silencer silencer18 = new Silencer("R18", 9.7, "Aluminium", true, 87, 5400.0, "Pistol", "USA", 2.4, true);
        Silencer silencer19 = new Silencer("S19", 12.4, "Steel", false, 79, 4650.0, "Shotgun", "Germany", 2.8, true);
        Silencer silencer20 = new Silencer("T20", 10.9, "Carbon", true, 90, 7100.0, "Rifle", "Japan", 2.5, true);

        store.store(silencer1);
        store.store(silencer2);
        store.store(silencer3);
        store.store(silencer4);
        store.store(silencer5);
        store.store(silencer6);
        store.store(silencer7);
        store.store(silencer8);
        store.store(silencer9);
        store.store(silencer10);
        store.store(silencer11);
        store.store(silencer12);
        store.store(silencer13);
        store.store(silencer14);
        store.store(silencer15);
        store.store(silencer16);
        store.store(silencer17);
        store.store(silencer18);
        store.store(silencer19);
        store.store(silencer20);

        store.update(silencer3, new Silencer("NEW-X", 10.1, "Carbon", true, 99, 8000.0, "Pistol", "India", 2.5, true));
        store.update(silencer17, new Silencer("NEW-Y", 11.5, "Steel", true, 95, 8200.0, "Rifle", "USA", 2.6, true));

        store.display();
    }
}