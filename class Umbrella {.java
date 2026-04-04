class Umbrella {

    String brand;
    String color;
    double price;
    double size;
    String material;
    String type;
    String handleType;
    String origin;
    boolean waterproof;
    boolean foldable;

    Umbrella(String brand,String color,double price,double size,String material,
             String type,String handleType,String origin,boolean waterproof,boolean foldable){

        this.brand=brand;
        this.color=color;
        this.price=price;
        this.size=size;
        this.material=material;
        this.type=type;
        this.handleType=handleType;
        this.origin=origin;
        this.waterproof=waterproof;
        this.foldable=foldable;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Size: "+this.size);
        System.out.println("Material: "+this.material);
        System.out.println("Type: "+this.type);
        System.out.println("HandleType: "+this.handleType);
        System.out.println("Origin: "+this.origin);
        System.out.println("Waterproof: "+this.waterproof);
        System.out.println("Foldable: "+this.foldable);
    }
}