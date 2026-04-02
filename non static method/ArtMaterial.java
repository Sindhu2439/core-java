class ArtMaterial {

    String brand;
    String type;
    String color;
    double price;
    String material;
    String packaging;
    String size;
    String origin;
    boolean washable;
    boolean nonToxic;

    ArtMaterial(String brand,String type,String color,double price,String material,
                String packaging,String size,String origin,boolean washable,boolean nonToxic){

        this.brand=brand;
        this.type=type;
        this.color=color;
        this.price=price;
        this.material=material;
        this.packaging=packaging;
        this.size=size;
        this.origin=origin;
        this.washable=washable;
        this.nonToxic=nonToxic;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("Type: "+this.type);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Material: "+this.material);
        System.out.println("Packaging: "+this.packaging);
        System.out.println("Size: "+this.size);
        System.out.println("Origin: "+this.origin);
        System.out.println("Washable: "+this.washable);
        System.out.println("NonToxic: "+this.nonToxic);
    }
}