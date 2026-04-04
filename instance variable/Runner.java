class Runner {

    public static void main(String[] args){

        double price;

        price = FoodItem.getPriceByItem("curd rice");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("burger");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("pizza");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("noodles");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("biryani");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("dosa");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("idli");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("fried rice");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("chapathi");
        System.out.println("price is " + price);

        String item = "juice";
        price = FoodItem.getPriceByItem(item);
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("sandwich");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("pasta");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("cake");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("ice cream");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("tea");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("coffee");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("milkshake");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("paratha");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("poha");
        System.out.println("price is " + price);

        price = FoodItem.getPriceByItem("upma");
        System.out.println("price is " + price);

        // extra for else condition
        price = FoodItem.getPriceByItem("unknown");
        System.out.println("price is " + price);
    }
}