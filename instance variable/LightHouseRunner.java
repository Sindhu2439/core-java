class LightHouseRunner {
    public static void main(String[] args) {

        Keeper k1 = new Keeper("Sindhu", LightHouseType.COASTAL, 5);
        Keeper k2 = new Keeper("Puneeth", LightHouseType.ISLAND, 3);
        Keeper k3 = new Keeper("Rahul", LightHouseType.RIVER, 4);

        Keeper[] keepers = {k1, k2, k3};

        LightHouse lightHouse = new LightHouse("Beacon", "Goa", keepers);

        lightHouse.display();
    }
}