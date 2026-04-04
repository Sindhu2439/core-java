class Stamp {

    String brand;
    String type;
    String color;
    double price;
    String size;
    String shape;
    String material;
    String origin;
    boolean reusable;
    boolean selfInking;

    Stamp(String brand,String type,String color,double price,String size,
          String shape,String material,String origin,boolean reusable,boolean selfInking){

        this.brand=brand;
        this.type=type;
        this.color=color;
        this.price=price;
        this.size=size;
        this.shape=shape;
        this.material=material;
        this.origin=origin;
        this.reusable=reusable;
        this.selfInking=selfInking;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("Type: "+this.type);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Size: "+this.size);
        System.out.println("Shape: "+this.shape);
        System.out.println("Material: "+this.material);
        System.out.println("Origin: "+this.origin);
        System.out.println("Reusable: "+this.reusable);
        System.out.println("SelfInking: "+this.selfInking);
    }
}