class LaserRunner {

    public static void main(String... args) {

        LaserStore store = new LaserStore();

        Laser laser1  = new Laser("RayTech", "Industrial", 5.0, "650nm", 1000, 50000.0, "Red", true, "Steel", false);
        Laser laser2  = new Laser("OptiBeam", "Medical", 3.5, "532nm", 800, 60000.0, "Green", true, "Aluminium", false);
        Laser laser3  = new Laser("LaserPro", "Military", 8.0, "808nm", 2000, 150000.0, "Blue", false, "Titanium", true);
        Laser laser4  = new Laser("BeamX", "Industrial", 4.0, "1064nm", 1200, 70000.0, "Red", true, "Steel", false);
        Laser laser5  = new Laser("LightCore", "Research", 2.5, "450nm", 600, 40000.0, "Violet", true, "Plastic", false);
        Laser laser6  = new Laser("PhotonMax", "Military", 9.0, "850nm", 2500, 200000.0, "Blue", false, "Titanium", true);
        Laser laser7  = new Laser("UltraBeam", "Medical", 3.0, "520nm", 700, 55000.0, "Green", true, "Aluminium", false);
        Laser laser8  = new Laser("NovaLaser", "Industrial", 4.5, "640nm", 1100, 65000.0, "Red", true, "Steel", false);
        Laser laser9  = new Laser("Zenith", "Research", 2.0, "480nm", 500, 35000.0, "Violet", true, "Plastic", false);
        Laser laser10 = new Laser("HyperRay", "Military", 10.0, "900nm", 3000, 250000.0, "Blue", false, "Titanium", true);
        Laser laser11 = new Laser("PulseBeam", "Industrial", 4.2, "660nm", 1300, 72000.0, "Red", true, "Steel", false);
        Laser laser12 = new Laser("NanoLight", "Medical", 3.2, "530nm", 750, 58000.0, "Green", true, "Aluminium", false);
        Laser laser13 = new Laser("SkyRay", "Research", 2.8, "470nm", 650, 42000.0, "Violet", true, "Plastic", false);
        Laser laser14 = new Laser("IronBeam", "Military", 8.5, "820nm", 2200, 180000.0, "Blue", false, "Titanium", true);
        Laser laser15 = new Laser("PhotonEdge", "Industrial", 4.8, "670nm", 1400, 75000.0, "Red", true, "Steel", false);
        Laser laser16 = new Laser("LumaCore", "Medical", 3.6, "540nm", 800, 61000.0, "Green", true, "Aluminium", false);
        Laser laser17 = new Laser("DarkRay", "Military", 9.5, "870nm", 2700, 220000.0, "Blue", false, "Titanium", true);
        Laser laser18 = new Laser("SunBeam", "Industrial", 4.1, "650nm", 1250, 68000.0, "Red", true, "Steel", false);
        Laser laser19 = new Laser("EcoLaser", "Research", 2.3, "460nm", 550, 38000.0, "Violet", true, "Plastic", false);
        Laser laser20 = new Laser("OmegaRay", "Military", 11.0, "920nm", 3500, 300000.0, "Blue", false, "Titanium", true);

        store.store(laser1);
        store.store(laser2);
        store.store(laser3);
        store.store(laser4);
        store.store(laser5);
        store.store(laser6);
        store.store(laser7);
        store.store(laser8);
        store.store(laser9);
        store.store(laser10);
        store.store(laser11);
        store.store(laser12);
        store.store(laser13);
        store.store(laser14);
        store.store(laser15);
        store.store(laser16);
        store.store(laser17);
        store.store(laser18);
        store.store(laser19);
        store.store(laser20);

        store.update(laser4, new Laser("AlphaX", "Industrial", 5.5, "700nm", 1500, 90000.0, "Red", true, "Steel", false));
        store.update(laser17, new Laser("OmegaX", "Military", 12.0, "950nm", 4000, 350000.0, "Blue", false, "Titanium", true));

        store.display();
    }
}