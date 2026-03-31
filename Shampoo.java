class Shampoo {

    String brand;
    String type;
    String fragrance;
    int volume;
    int price;
    String color;
    String hairType;
    boolean isOrganic;
    boolean isHerbal;
    boolean isAvailable;
    int stock;
    int code;
    int year;
    String country;
    String usage;
    String category;
    String supplier;
    String packaging;
    boolean isAntiDandruff;
    boolean isConditioning;
    boolean isMedicated;
    double phLevel;
    String quality;
    String design;
    String warranty;
    boolean isLiquid;

    Shampoo() {
        System.out.println("Shampoo constructor");

        brand="Clinic Plus";
        type="Hair Care";
        fragrance="Floral";
        volume=200;
        price=150;
        color="White";
        hairType="All";
        isOrganic=false;
        isHerbal=true;
        isAvailable=true;
        stock=50;
        code=701;
        year=2024;
        country="India";
        usage="Daily";
        category="Cosmetic";
        supplier="Store";
        packaging="Bottle";
        isAntiDandruff=true;
        isConditioning=true;
        isMedicated=false;
        phLevel=5.5;
        quality="High";
        design="Simple";
        warranty="NA";
        isLiquid=true;
    }
}