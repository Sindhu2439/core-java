class SugarCaneRunner {

    public static void main(String... args) {

        Factory factory = new Factory("Ramesh", 50);

        factory.sugarCane = new SugarCane();
        factory.sugarCane.height = 10;
        factory.sugarCane.region = "Mandya";

        factory.type = SugarType.ORGANIC;

        factory.show();
    }
}