class Locker {

    String brand;
    String material;
    int capacity;
    String color;
    double price;
    double height;
    double width;
    String lockType;
    String origin;
    boolean digital;

    Locker(String brand,String material,int capacity,String color,double price,
           double height,double width,String lockType,String origin,boolean digital){

        this.brand=brand;
        this.material=material;
        this.capacity=capacity;
        this.color=color;
        this.price=price;
        this.height=height;
        this.width=width;
        this.lockType=lockType;
        this.origin=origin;
        this.digital=digital;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("Material: "+this.material);
        System.out.println("Capacity: "+this.capacity);
        System.out.println("Color: "+this.color);
        System.out.println("Price: "+this.price);
        System.out.println("Height: "+this.height);
        System.out.println("Width: "+this.width);
        System.out.println("LockType: "+this.lockType);
        System.out.println("Origin: "+this.origin);
        System.out.println("Digital: "+this.digital);
    }
}