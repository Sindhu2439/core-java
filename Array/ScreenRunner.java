class ScreenRunner{
    public static void main(String... args) {

        ScreenStore store = new ScreenStore();

        Screen screen1  = new Screen("Samsung", 27.0, "4K", "OLED", 144, 45000, "HDMI", false, 600, false);
        Screen screen2  = new Screen("LG", 24.0, "FHD", "IPS", 75, 18000, "HDMI", false, 300, false);
        Screen screen3  = new Screen("Dell", 32.0, "2K", "VA", 165, 52000, "HDMI", false, 400, false);
        Screen screen4  = new Screen("Apple", 27.0, "5K", "IPS", 60, 130000, "Thunderbolt", false, 500, false);
        Screen screen5  = new Screen("Asus", 25.0, "FHD", "TN", 240, 22000, "HDMI", false, 250, false);
        Screen screen6  = new Screen("Acer", 23.8, "FHD", "IPS", 75, 14000, "HDMI", false, 280, false);
        Screen screen7  = new Screen("BenQ", 27.0, "2K", "IPS", 144, 38000, "HDMI", false, 350, false);
        Screen screen8  = new Screen("HP", 27.0, "4K", "IPS", 60, 42000, "HDMI", false, 450, false);
        Screen screen9  = new Screen("MSI", 27.0, "2K", "OLED", 240, 60000, "HDMI", false, 600, false);
        Screen screen10 = new Screen("Philips", 21.5, "FHD", "VA", 75, 11000, "HDMI", false, 250, false);
        Screen screen11 = new Screen("Samsung", 32.0, "4K", "QLED", 120, 75000, "HDMI", false, 700, false);
        Screen screen12 = new Screen("LG", 34.0, "UWQHD", "NanoIPS", 160, 55000, "HDMI", false, 400, false);
        Screen screen13 = new Screen("Dell", 24.0, "FHD", "IPS", 60, 15000, "HDMI", true, 300, false);
        Screen screen14 = new Screen("Asus", 27.0, "4K", "IPS", 144, 48000, "HDMI", false, 500, false);
        Screen screen15 = new Screen("Acer", 27.0, "2K", "IPS", 165, 35000, "HDMI", false, 380, false);
        Screen screen16 = new Screen("AOC", 24.0, "FHD", "IPS", 144, 17000, "HDMI", false, 270, false);
        Screen screen17 = new Screen("BenQ", 32.0, "4K", "IPS", 60, 50000, "HDMI", false, 450, false);
        Screen screen18 = new Screen("Gigabyte", 27.0, "2K", "IPS", 170, 33000, "HDMI", false, 400, false);
        Screen screen19 = new Screen("Corsair", 27.0, "2K", "VA", 165, 36000, "HDMI", false, 400, false);
        Screen screen20 = new Screen("ViewSonic", 24.0, "FHD", "IPS", 100, 16000, "HDMI", false, 300, false);

        store.store(screen1);
        store.store(screen2);
        store.store(screen3);
        store.store(screen4);
        store.store(screen5);
        store.store(screen6);
        store.store(screen7);
        store.store(screen8);
        store.store(screen9);
        store.store(screen10);
        store.store(screen11);
        store.store(screen12);
        store.store(screen13);
        store.store(screen14);
        store.store(screen15);
        store.store(screen16);
        store.store(screen17);
        store.store(screen18);
        store.store(screen19);
        store.store(screen20);

        store.update(screen11, new Screen("Sony", 27.0, "4K", "OLED", 144, 90000, "HDMI", false, 800, false));
        store.update(screen9, new Screen("MSI", 27.0, "2K", "OLED", 240, 80000, "HDMI", false, 700, false));

        store.display();
    }
}