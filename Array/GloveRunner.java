class GloveRunner {

    public static void main(String... args) {

        GloveStore store = new GloveStore();

        Glove glove1  = new Glove("Boxing", 10.0, "Leather", true, 90, 1500.0, "Black", "Sports", 0.5, false);
        Glove glove2  = new Glove("Winter", 9.5, "Wool", true, 80, 800.0, "Blue", "Cold Weather", 0.3, false);
        Glove glove3  = new Glove("Driving", 8.0, "Synthetic", false, 85, 600.0, "Brown", "Car", 0.2, false);
        Glove glove4  = new Glove("Gym", 10.5, "Rubber", true, 88, 1200.0, "Red", "Workout", 0.4, false);
        Glove glove5  = new Glove("Gardening", 11.0, "Cotton", false, 75, 300.0, "Green", "Garden", 0.3, false);
        Glove glove6  = new Glove("Industrial", 12.0, "Steel Fiber", true, 95, 2500.0, "Grey", "Factory", 0.8, true);
        Glove glove7  = new Glove("Medical", 9.0, "Latex", true, 92, 1000.0, "White", "Hospital", 0.2, false);
        Glove glove8  = new Glove("Snow", 11.5, "Wool", true, 85, 1800.0, "White", "Snow", 0.6, false);
        Glove glove9  = new Glove("Motorbike", 10.2, "Leather", true, 90, 1600.0, "Black", "Riding", 0.5, false);
        Glove glove10 = new Glove("Security", 12.5, "Kevlar", true, 98, 3000.0, "Dark", "Protection", 0.7, true);
        Glove glove11 = new Glove("Sports", 10.0, "Leather", true, 87, 1400.0, "Blue", "Cricket", 0.5, false);
        Glove glove12 = new Glove("Winter Pro", 9.8, "Wool", true, 83, 900.0, "Grey", "Cold", 0.4, false);
        Glove glove13 = new Glove("Utility", 10.6, "Cotton", false, 80, 700.0, "Green", "General", 0.3, false);
        Glove glove14 = new Glove("Heavy Duty", 12.2, "Steel Fiber", true, 96, 2600.0, "Black", "Industrial", 0.9, true);
        Glove glove15 = new Glove("Light", 8.5, "Fabric", false, 70, 400.0, "Yellow", "Light Work", 0.2, false);
        Glove glove16 = new Glove("Smart Glove", 10.8, "Nano Fiber", true, 99, 5000.0, "Black", "Tech", 0.5, true);
        Glove glove17 = new Glove("Racing", 11.0, "Carbon", true, 94, 2200.0, "Red", "Racing", 0.6, false);
        Glove glove18 = new Glove("Fire Resistant", 12.3, "Kevlar", true, 97, 3500.0, "Orange", "Fire Safety", 0.8, true);
        Glove glove19 = new Glove("Fishing", 9.2, "Rubber", true, 82, 650.0, "Blue", "Fishing", 0.3, false);
        Glove glove20 = new Glove("Military", 12.8, "Kevlar", true, 99, 6000.0, "Camouflage", "Defense", 1.0, true);

        store.store(glove1);
        store.store(glove2);
        store.store(glove3);
        store.store(glove4);
        store.store(glove5);
        store.store(glove6);
        store.store(glove7);
        store.store(glove8);
        store.store(glove9);
        store.store(glove10);
        store.store(glove11);
        store.store(glove12);
        store.store(glove13);
        store.store(glove14);
        store.store(glove15);
        store.store(glove16);
        store.store(glove17);
        store.store(glove18);
        store.store(glove19);
        store.store(glove20);

        store.update(glove3, new Glove("Updated-X", 10.1, "Carbon", true, 99, 9999.0, "Black", "Updated", 0.5, true));
        store.update(glove15, new Glove("Updated-Y", 11.2, "Nano", true, 95, 8888.0, "Grey", "Updated", 0.6, true));

        store.display();
    }
}