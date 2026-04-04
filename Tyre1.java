class Tyre {

    String brand;
    String vehicleType;
    double price;
    double size;
    String material;
    String pattern;
    String origin;
    int durability;
    boolean tubeless;
    boolean radial;

    Tyre(String brand,String vehicleType,double price,double size,String material,
         String pattern,String origin,int durability,boolean tubeless,boolean radial){

        this.brand=brand;
        this.vehicleType=vehicleType;
        this.price=price;
        this.size=size;
        this.material=material;
        this.pattern=pattern;
        this.origin=origin;
        this.durability=durability;
        this.tubeless=tubeless;
        this.radial=radial;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("VehicleType: "+this.vehicleType);
        System.out.println("Price: "+this.price);
        System.out.println("Size: "+this.size);
        System.out.println("Material: "+this.material);
        System.out.println("Pattern: "+this.pattern);
        System.out.println("Origin: "+this.origin);
        System.out.println("Durability: "+this.durability);
        System.out.println("Tubeless: "+this.tubeless);
        System.out.println("Radial: "+this.radial);
    }
}