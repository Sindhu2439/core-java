class WaterMelon {

    static double getPriceByQuantity(int quantity){
        System.out.println("executing getPriceByQuantity method " + quantity);

        if(quantity == 1){
            System.out.println("price is 10");
            return 10;
        }
        if(quantity == 2){
            System.out.println("price is 20");
            return 20;
        }
        if(quantity == 3){
            System.out.println("price is 30");
            return 30;
        }
        if(quantity == 4){
            System.out.println("price is 40");
            return 40;
        }
        if(quantity == 5){
            System.out.println("price is 50");
            return 50;
        }
        if(quantity == 6){
            System.out.println("price is 60");
            return 60;
        }
        if(quantity == 7){
            System.out.println("price is 70");
            return 70;
        }
        if(quantity == 8){
            System.out.println("price is 80");
            return 80;
        }
        if(quantity == 9){
            System.out.println("price is 90");
            return 90;
        }
        if(quantity == 10){
            System.out.println("price is 100");
            return 100;
        }
        else{
            System.out.println("quantity not matching");
        }

        return -100;
    }
}