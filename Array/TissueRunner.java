class TissueRunner {

    public static void main(String... args) {

        TissueStore store = new TissueStore();

        Tissue tissue1  = new Tissue("Pampers", "Facial", 3, 200, true, 120.0, "White", "Aloe", 30.0, true);
        Tissue tissue2  = new Tissue("Dettol", "Antibacterial", 2, 150, true, 110.0, "White", "Mint", 28.0, true);
        Tissue tissue3  = new Tissue("Nice", "Kitchen", 1, 100, false, 80.0, "White", "None", 25.0, true);
        Tissue tissue4  = new Tissue("Kleenex", "Facial", 3, 220, true, 130.0, "White", "Floral", 32.0, true);
        Tissue tissue5  = new Tissue("Bounty", "Kitchen", 2, 180, true, 140.0, "White", "Lemon", 35.0, true);
        Tissue tissue6  = new Tissue("SoftTouch", "Facial", 3, 210, true, 125.0, "White", "Aloe", 30.5, true);
        Tissue tissue7  = new Tissue("FreshUp", "Wet Wipes", 1, 80, true, 90.0, "Blue", "Cool", 22.0, true);
        Tissue tissue8  = new Tissue("CarePlus", "Facial", 2, 160, true, 115.0, "White", "Rose", 29.0, true);
        Tissue tissue9  = new Tissue("SuperSoft", "Kitchen", 2, 170, false, 100.0, "White", "Lemon", 31.0, true);
        Tissue tissue10 = new Tissue("UltraClean", "Antibacterial", 3, 200, true, 150.0, "White", "Mint", 33.0, true);
        Tissue tissue11 = new Tissue("FreshMate", "Facial", 2, 140, true, 95.0, "White", "Aloe", 27.0, true);
        Tissue tissue12 = new Tissue("EcoWipe", "Kitchen", 1, 120, true, 85.0, "Brown", "Natural", 26.0, true);
        Tissue tissue13 = new Tissue("SoftLine", "Facial", 3, 230, true, 135.0, "White", "Lavender", 34.0, true);
        Tissue tissue14 = new Tissue("CleanPro", "Wet Wipes", 1, 90, true, 100.0, "Blue", "Fresh", 24.0, true);
        Tissue tissue15 = new Tissue("SilkyTouch", "Facial", 3, 250, true, 160.0, "White", "Rose", 36.0, true);
        Tissue tissue16 = new Tissue("PureCare", "Kitchen", 2, 190, true, 145.0, "White", "Lemon", 32.0, true);
        Tissue tissue17 = new Tissue("GreenWipe", "Eco", 2, 170, true, 105.0, "Green", "Natural", 29.0, true);
        Tissue tissue18 = new Tissue("MaxClean", "Antibacterial", 3, 210, true, 155.0, "White", "Mint", 33.5, true);
        Tissue tissue19 = new Tissue("UltraSoft", "Facial", 3, 240, true, 165.0, "White", "Aloe", 37.0, true);
        Tissue tissue20 = new Tissue("FreshLeaf", "Eco", 2, 180, true, 120.0, "Green", "Natural", 30.0, true);

        store.store(tissue1);
        store.store(tissue2);
        store.store(tissue3);
        store.store(tissue4);
        store.store(tissue5);
        store.store(tissue6);
        store.store(tissue7);
        store.store(tissue8);
        store.store(tissue9);
        store.store(tissue10);
        store.store(tissue11);
        store.store(tissue12);
        store.store(tissue13);
        store.store(tissue14);
        store.store(tissue15);
        store.store(tissue16);
        store.store(tissue17);
        store.store(tissue18);
        store.store(tissue19);
        store.store(tissue20);

        store.update(tissue5, new Tissue("UltraSoft-X", "Kitchen", 2, 200, true, 180.0, "White", "Lemon", 38.0, true));
        store.update(tissue17, new Tissue("EcoGreen-Y", "Eco", 2, 190, true, 130.0, "Green", "Natural", 31.0, true));

        store.display();
    }
}