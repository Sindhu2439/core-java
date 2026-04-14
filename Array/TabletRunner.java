class TabletRunner {
    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        tablet.save("iPad");
        tablet.save("Samsung");
        tablet.save("Lenovo");
        tablet.save("Microsoft");
        tablet.save("Huawei");
        tablet.store("Lenovo");
        tablet.store("Apple");
    }
}