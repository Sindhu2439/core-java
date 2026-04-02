class WindShield {

    String brand;
    String vehicleType;
    double price;
    double size;
    String material;
    String tintColor;
    String origin;
    boolean scratchResistant;
    boolean laminated;
    boolean tempered;

    WindShield(String brand,String vehicleType,double price,double size,String material,
               String tintColor,String origin,boolean scratchResistant,
               boolean laminated,boolean tempered){

        this.brand=brand;
        this.vehicleType=vehicleType;
        this.price=price;
        this.size=size;
        this.material=material;
        this.tintColor=tintColor;
        this.origin=origin;
        this.scratchResistant=scratchResistant;
        this.laminated=laminated;
        this.tempered=tempered;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("VehicleType: "+this.vehicleType);
        System.out.println("Price: "+this.price);
        System.out.println("Size: "+this.size);
        System.out.println("Material: "+this.material);
        System.out.println("TintColor: "+this.tintColor);
        System.out.println("Origin: "+this.origin);
        System.out.println("ScratchResistant: "+this.scratchResistant);
        System.out.println("Laminated: "+this.laminated);
        System.out.println("Tempered: "+this.tempered);
    }
}