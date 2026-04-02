class Xerox {

    String brand;
    String model;
    double price;
    String color;
    double weight;
    String type;
    int pagesPerMinute;
    String connection;
    String origin;
    boolean wireless;

    Xerox(String brand,String model,double price,String color,double weight,
          String type,int pagesPerMinute,String connection,String origin,boolean wireless){

        this.brand=brand;
        this.model=model;
        this.price=price;
        this.color=color;
        this.weight=weight;
        this.type=type;
        this.pagesPerMinute=pagesPerMinute;
        this.connection=connection;
        this.origin=origin;
        this.wireless=wireless;
    }

    void show(){

        System.out.println("Brand: "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("Price: "+this.price);
        System.out.println("Color: "+this.color);
        System.out.println("Weight: "+this.weight);
        System.out.println("Type: "+this.type);
        System.out.println("PagesPerMinute: "+this.pagesPerMinute);
        System.out.println("Connection: "+this.connection);
        System.out.println("Origin: "+this.origin);
        System.out.println("Wireless: "+this.wireless);
    }
}