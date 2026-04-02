class Specs {

    String brand;
    String frameType;
    String color;
    double price;
    String lensType;
    double weight;
    String size;
    String shape;
    String origin;
    boolean antiGlare;

    Specs(String brand,String frameType,String color,double price,String lensType,
          double weight,String size,String shape,String origin,boolean antiGlare){

        this.brand=brand;
        this.frameType=frameType;
        this.color=color;
        this.price=price;
        this.lensType=lensType;
        this.weight=weight;
        this.size=size;
        this.shape=shape;
        this.origin=origin;
        this.antiGlare=antiGlare;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("FrameType: "+this.frameType);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("LensType: "+this.lensType);
        System.out.println("Weight: "+this.weight);
        System.out.println("Size: "+this.size);
        System.out.println("Shape: "+this.shape);
        System.out.println("Origin: "+this.origin);
        System.out.println("AntiGlare: "+this.antiGlare);
    }
}