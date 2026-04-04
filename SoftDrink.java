class SoftDrink {

    String brand;
    String flavor;
    String color;
    double price;
    double volume;
    String type;
    String packaging;
    String origin;
    boolean sugarFree;
    boolean carbonated;

    SoftDrink(String brand,String flavor,String color,double price,double volume,
              String type,String packaging,String origin,boolean sugarFree,boolean carbonated){

        this.brand=brand;
        this.flavor=flavor;
        this.color=color;
        this.price=price;
        this.volume=volume;
        this.type=type;
        this.packaging=packaging;
        this.origin=origin;
        this.sugarFree=sugarFree;
        this.carbonated=carbonated;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("Flavor: "+this.flavor);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Volume: "+this.volume);
        System.out.println("Type: "+this.type);
        System.out.println("Packaging: "+this.packaging);
        System.out.println("Origin: "+this.origin);
        System.out.println("SugarFree: "+this.sugarFree);
        System.out.println("Carbonated: "+this.carbonated);
    }
}