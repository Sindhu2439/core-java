class Screen {
    String brand;
    double size;
    String resolution;
    String panelType;
    int refreshRate;
    double price;
    String connectivity;
    boolean isTouchScreen;
    double brightness;
    boolean isCurved;
 
    Screen(String brand, double size, String resolution, String panelType, int refreshRate,
           double price, String connectivity, boolean isTouchScreen, double brightness, boolean isCurved) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        this.panelType = panelType;
        this.refreshRate = refreshRate;
        this.price = price;
        this.connectivity = connectivity;
        this.isTouchScreen = isTouchScreen;
        this.brightness = brightness;
        this.isCurved = isCurved;
    }
 
    void show() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Brand: " + this.brand);
        System.out.println("Size (inches): " + this.size);
        System.out.println("Resolution: " + this.resolution);
        System.out.println("Panel Type: " + this.panelType);
        System.out.println("Refresh Rate: " + this.refreshRate + " Hz");
        System.out.println("Price: " + this.price);
        System.out.println("Connectivity: " + this.connectivity);
        System.out.println("Is Touch Screen: " + this.isTouchScreen);
        System.out.println("Brightness (nits): " + this.brightness);
        System.out.println("Is Curved: " + this.isCurved);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
 