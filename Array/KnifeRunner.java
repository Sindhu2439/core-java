class KnifeRunner {

    public static void main(String[] args) {

        Knife k1 = new Knife("Steel", 5);
        Knife k2 = new Knife("Iron", 6);

        KitchenKnife kk1 = new KitchenKnife("Steel", 5, "Alloy", "Prestige");
        KitchenKnife kk2 = new KitchenKnife("Iron", 6, "Carbon", "Pigeon");

        SmartKnife sk1 = new SmartKnife("Steel", 5, "Alloy", "SmartBrand");
        SmartKnife sk2 = new SmartKnife("Iron", 6, "Carbon", "AutoBrand");

    }
}