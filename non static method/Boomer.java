class Boomer {

    String brand;
    String flavor;
    String color;
    double price;
    int quantity;
    String shape;
    String packType;
    double weight;
    String origin;
    boolean sugarFree;

    Boomer(String brand,String flavor,String color,double price,int quantity,
           String shape,String packType,double weight,String origin,boolean sugarFree){

        this.brand=brand;
        this.flavor=flavor;
        this.color=color;
        this.price=price;
        this.quantity=quantity;
        this.shape=shape;
        this.packType=packType;
        this.weight=weight;
        this.origin=origin;
        this.sugarFree=sugarFree;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("Flavor: "+this.flavor);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Shape: "+this.shape);
        System.out.println("PackType: "+this.packType);
        System.out.println("Weight: "+this.weight);
        System.out.println("Origin: "+this.origin);
        System.out.println("SugarFree: "+this.sugarFree);
    }
}