class SewingThread extends Thread {
    String type;
    String brand;

    SewingThread(String color, int length, String type, String brand) {
        super(color, length);
        this.type = type;
        this.brand = brand;
        System.out.println("SewingThread constructor called");
    }
}