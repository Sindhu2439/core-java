class FoodItem {

    static double getPriceByItem(String item){
        System.out.println("executing getPriceByItem method " + item);

        if("curd rice" == item){
            System.out.println("price is 20");
            return 20;
        }
        if("burger" == item){
            System.out.println("price is 120");
            return 120;
        }
        if("pizza" == item){
            System.out.println("price is 250");
            return 250;
        }
        if("noodles" == item){
            System.out.println("price is 140");
            return 140;
        }
        if("biryani" == item){
            System.out.println("price is 180");
            return 180;
        }
        if("dosa" == item){
            System.out.println("price is 60");
            return 60;
        }
        if("idli" == item){
            System.out.println("price is 40");
            return 40;
        }
        if("fried rice" == item){
            System.out.println("price is 130");
            return 130;
        }
        if("chapathi" == item){
            System.out.println("price is 50");
            return 50;
        }
        if("juice" == item){
            System.out.println("price is 70");
            return 70;
        }
        if("sandwich" == item){
            System.out.println("price is 90");
            return 90;
        }
        if("pasta" == item){
            System.out.println("price is 160");
            return 160;
        }
        if("cake" == item){
            System.out.println("price is 300");
            return 300;
        }
        if("ice cream" == item){
            System.out.println("price is 80");
            return 80;
        }
        if("tea" == item){
            System.out.println("price is 15");
            return 15;
        }
        if("coffee" == item){
            System.out.println("price is 25");
            return 25;
        }
        if("milkshake" == item){
            System.out.println("price is 110");
            return 110;
        }
        if("paratha" == item){
            System.out.println("price is 55");
            return 55;
        }
        if("poha" == item){
            System.out.println("price is 45");
            return 45;
        }
        if("upma" == item){
            System.out.println("price is 50");
            return 50;
        }
        else{
            System.out.println("item not matching");
        }

        return -100;
    }
}