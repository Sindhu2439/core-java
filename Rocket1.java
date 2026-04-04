class Rocket {

    String name;
    String fuelType;
    double weight;
    double height;
    String country;
    int stages;
    double speed;
    String manufacturer;
    String launchSite;
    boolean reusable;

    Rocket(String name,String fuelType,double weight,double height,String country,
           int stages,double speed,String manufacturer,String launchSite,boolean reusable){

        this.name=name;
        this.fuelType=fuelType;
        this.weight=weight;
        this.height=height;
        this.country=country;
        this.stages=stages;
        this.speed=speed;
        this.manufacturer=manufacturer;
        this.launchSite=launchSite;
        this.reusable=reusable;
    }

    void show(){

        System.out.println("Name: "+this.name);
        System.out.println("FuelType: "+this.fuelType);
        System.out.println("Weight: "+this.weight);
        System.out.println("Height: "+this.height);
        System.out.println("Country: "+this.country);
        System.out.println("Stages: "+this.stages);
        System.out.println("Speed: "+this.speed);
        System.out.println("Manufacturer: "+this.manufacturer);
        System.out.println("LaunchSite: "+this.launchSite);
        System.out.println("Reusable: "+this.reusable);
    }
}