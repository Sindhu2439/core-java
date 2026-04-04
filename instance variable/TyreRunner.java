class TyreRunner {

    public static void main(String[] args){

        double price = Tyre.getPriceByBrandAndSize("MRF", 17);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("CEAT", 18);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("Apollo", 16);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("Bridgestone", 19);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("JK", 15);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("Michelin", 20);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("Goodyear", 17);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("TVS", 14);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("Yokohama", 18);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("Dunlop", 16);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("Pirelli", 21);
        System.out.println("price is " + price);

        String brand = "Continental";
        int size = 19;
        price = Tyre.getPriceByBrandAndSize(brand, size);
        System.out.println("price is " + price);

        price = Tyre.getPriceByBrandAndSize("Unknown", 10);
        System.out.println("price is " + price);
    }
}