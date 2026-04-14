class SparkPlugRunner {
    public static void main(String[] args) {
        SparkPlug sparkPlug = new SparkPlug();
        sparkPlug.save("Iridium");
        sparkPlug.save("Platinum");
        sparkPlug.save("Copper");
        sparkPlug.save("Silver");
        sparkPlug.save("Double");
        sparkPlug.store("Platinum");
        sparkPlug.store("Titanium");
    }
}