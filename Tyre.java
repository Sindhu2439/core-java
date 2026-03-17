class Tyre {

    static double getPriceByBrandAndSize(String brand, int size){
        System.out.println("executing getPriceByBrandAndSize method " + brand + " " + size);

        if("MRF" == brand && size == 17){
            System.out.println("price is 1200");
            return 1200;
        }
        if("CEAT" == brand && size == 18){
            System.out.println("price is 1500");
            return 1500;
        }
        if("Apollo" == brand && size == 17){
            System.out.println("price is 1100");
            return 1100;
        }
        if("Bridgestone" == brand && size == 19){
            System.out.println("price is 2000");
            return 2000;
        }
        if("JK" == brand && size == 15){
            System.out.println("price is 900");
            return 900;
        }
        if("Michelin" == brand && size == 20){
            System.out.println("price is 2500");
            return 2500;
        }
        if("Goodyear" == brand && size == 17){
            System.out.println("price is 1400");
            return 1400;
        }
        if("TVS" == brand && size == 14){
            System.out.println("price is 800");
            return 800;
        }
        if("Yokohama" == brand && size == 18){
            System.out.println("price is 1800");
            return 1800;
        }
        if("Dunlop" == brand && size == 16){
            System.out.println("price is 1300");
            return 1300;
        }
        if("Pirelli" == brand && size == 21){
            System.out.println("price is 3000");
            return 3000;
        }
        if("Continental" == brand && size == 19){
            System.out.println("price is 2200");
            return 2200;
        }
        else{
            System.out.println("brand or size not matching");
        }

        return -100;
    }
}