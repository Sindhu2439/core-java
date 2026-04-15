class SpaceShipRunner {

    public static void main(String... args) {

        SpaceShipStore store = new SpaceShipStore();

        SpaceShip spaceship1  = new SpaceShip("Apollo", 25000, "Hydrogen", "Moon Mission", 5, 30000, "USA", true, 3, 30);
        SpaceShip spaceship2  = new SpaceShip("Chandrayaan", 24000, "LOX", "Moon Mission", 4, 28000, "India", false, 0, 28);
        SpaceShip spaceship3  = new SpaceShip("Falcon", 30000, "RP-1", "Cargo", 10, 35000, "USA", true, 2, 40);
        SpaceShip spaceship4  = new SpaceShip("Starship", 40000, "Methane", "Mars Mission", 100, 120000, "USA", true, 10, 120);
        SpaceShip spaceship5  = new SpaceShip("Voyager", 15000, "Nuclear", "Deep Space", 0, 20000, "USA", false, 0, 25);
        SpaceShip spaceship6  = new SpaceShip("Dragon", 28000, "LOX", "ISS Supply", 7, 22000, "USA", true, 4, 18);
        SpaceShip spaceship7  = new SpaceShip("Gaganyaan", 23000, "LOX", "Human Spaceflight", 3, 26000, "India", false, 3, 26);
        SpaceShip spaceship8  = new SpaceShip("Hermes", 27000, "Hydrogen", "Research", 6, 24000, "Europe", true, 2, 22);
        SpaceShip spaceship9  = new SpaceShip("Orion", 29000, "LOX", "Moon Mission", 4, 31000, "USA", true, 4, 35);
        SpaceShip spaceship10 = new SpaceShip("Salyut", 20000, "Chemical", "Space Station", 10, 50000, "Russia", false, 5, 50);
        SpaceShip spaceship11 = new SpaceShip("Enterprise", 26000, "LOX", "Test Flight", 0, 18000, "USA", false, 0, 20);
        SpaceShip spaceship12 = new SpaceShip("Zarya", 21000, "Chemical", "Station Module", 6, 45000, "Russia", false, 2, 48);
        SpaceShip spaceship13 = new SpaceShip("Hope", 25000, "Hydrogen", "Mars Orbit", 5, 29000, "UAE", true, 3, 30);
        SpaceShip spaceship14 = new SpaceShip("Kounotori", 22000, "LOX", "Cargo", 8, 23000, "Japan", false, 1, 24);
        SpaceShip spaceship15 = new SpaceShip("Tianzhou", 22500, "LOX", "Cargo", 8, 23500, "China", false, 1, 25);
        SpaceShip spaceship16 = new SpaceShip("Shenzhou", 23000, "LOX", "Human Mission", 3, 27000, "China", true, 3, 27);
        SpaceShip spaceship17 = new SpaceShip("Artemis", 38000, "Methane", "Moon Return", 10, 90000, "USA", true, 4, 110);
        SpaceShip spaceship18 = new SpaceShip("Buran", 25000, "Chemical", "Test", 0, 60000, "Russia", false, 0, 45);
        SpaceShip spaceship19 = new SpaceShip("Pegasus", 26000, "LOX", "Satellite", 2, 21000, "USA", true, 1, 20);
        SpaceShip spaceship20 = new SpaceShip("Cosmos", 24000, "Nuclear", "Deep Space", 0, 30000, "Russia", false, 0, 32);

        store.store(spaceship1);
        store.store(spaceship2);
        store.store(spaceship3);
        store.store(spaceship4);
        store.store(spaceship5);
        store.store(spaceship6);
        store.store(spaceship7);
        store.store(spaceship8);
        store.store(spaceship9);
        store.store(spaceship10);
        store.store(spaceship11);
        store.store(spaceship12);
        store.store(spaceship13);
        store.store(spaceship14);
        store.store(spaceship15);
        store.store(spaceship16);
        store.store(spaceship17);
        store.store(spaceship18);
        store.store(spaceship19);
        store.store(spaceship20);

        store.update(spaceship4, new SpaceShip("STARSHIP-X", 45000, "Methane", "Mars Mission", 120, 130000, "USA", true, 12, 130));
        store.update(spaceship17, new SpaceShip("ARTEMIS-NEW", 42000, "Methane", "Moon Mission", 15, 95000, "USA", true, 6, 115));

        store.display();
    }
}