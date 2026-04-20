class TouchPadRunner {
    public static void main(String[] args) {
        TouchPad t1 = new TouchPad("Dell", 5);
        TouchPad t2 = new TouchPad("HP", 6);

        LaptopTouchPad l1 = new LaptopTouchPad("Lenovo", 5, "IdeaPad", 0.8);
        LaptopTouchPad l2 = new LaptopTouchPad("Asus", 6, "ROG", 0.9);

        SmartTouchPad s1 = new SmartTouchPad("Apple", 7, "MacBook", 1.0);
        SmartTouchPad s2 = new SmartTouchPad("MSI", 6, "Gaming", 0.95);
    }
}