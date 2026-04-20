class ThreadRunner {

    public static void main(String[] args) {

        Thread t1 = new Thread("Red", 10);
        Thread t2 = new Thread("Blue", 20);

        SewingThread st1 = new SewingThread("Green", 15, "Cotton", "BrandA");
        SewingThread st2 = new SewingThread("Yellow", 25, "Silk", "BrandB");

        SmartThread sm1 = new SmartThread("Black", 30, "Wool", "SmartBrand");
        SmartThread sm2 = new SmartThread("White", 35, "Polyester", "AutoBrand");

    }
}