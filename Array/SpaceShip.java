class SpaceShip {

    String name;
    double speed;
    String fuelType;
    String missionType;
    int capacity;
    double weight;
    String origin;
    boolean isReusable;
    int crew;
    double height;

    SpaceShip(String name, double speed, String fuelType, String missionType,
              int capacity, double weight, String origin, boolean isReusable,
              int crew, double height) {

        this.name = name;
        this.speed = speed;
        this.fuelType = fuelType;
        this.missionType = missionType;
        this.capacity = capacity;
        this.weight = weight;
        this.origin = origin;
        this.isReusable = isReusable;
        this.crew = crew;
        this.height = height;
    }

    void show() {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Name: " + this.name);
        System.out.println("Speed: " + this.speed);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("Mission: " + this.missionType);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Weight: " + this.weight);
        System.out.println("Origin: " + this.origin);
        System.out.println("Reusable: " + this.isReusable);
        System.out.println("Crew: " + this.crew);
        System.out.println("Height: " + this.height);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}