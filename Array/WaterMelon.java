class WaterMelon{
   String color;
    double weight;
    String shape;
    boolean isSeedless;
    int numberOfSeeds;
    double price;
    String taste;
    String origin;
    double diameter;
    boolean isRipe;
   WaterMelon(String color, double weight, String shape, boolean isSeedless, int numberOfSeeds, double price, String taste, String origin, double diameter, boolean isRipe){
        this.color = color;
        this.weight = weight;
        this.shape = shape;
        this.isSeedless = isSeedless;
        this.numberOfSeeds = numberOfSeeds;
        this.price = price;
        this.taste = taste;
        this.origin = origin;
        this.diameter = diameter;
        this.isRipe = isRipe;
   }
   void show() {
	   
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	System.out.println("color: " + this.color);
    System.out.println("Weight: " + this.weight);
    System.out.println("Shape: " + this.shape);
    System.out.println("Is Seedless: " + this.isSeedless);
    System.out.println("Number of Seeds: " + this.numberOfSeeds);
    System.out.println("Price: " + this.price);
    System.out.println("Taste: " + this.taste);
    System.out.println("Origin: " + this.origin);
    System.out.println("Diameter: " + this.diameter);
    System.out.println("Is Ripe: " + this.isRipe);
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
}


}