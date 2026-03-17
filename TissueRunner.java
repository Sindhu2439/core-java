class TissueRunner {

    public static void main(String[] args){

        double price = TissuePaper.getPriceByThickness("thin");
        System.out.println("price is " + price);

        price = TissuePaper.getPriceByThickness("medium");
        System.out.println("price is " + price);

        price = TissuePaper.getPriceByThickness("thick");
        System.out.println("price is " + price);

        price = TissuePaper.getPriceByThickness("extra thick");
        System.out.println("price is " + price);

        price = TissuePaper.getPriceByThickness("soft");
        System.out.println("price is " + price);

        price = TissuePaper.getPriceByThickness("ultra soft");
        System.out.println("price is " + price);

        price = TissuePaper.getPriceByThickness("double layer");
        System.out.println("price is " + price);

        price = TissuePaper.getPriceByThickness("triple layer");
        System.out.println("price is " + price);

        price = TissuePaper.getPriceByThickness("premium");
        System.out.println("price is " + price);

        String type = "eco";
        price = TissuePaper.getPriceByThickness(type);
        System.out.println("price is " + price);

        price = TissuePaper.getPriceByThickness("unknown");
        System.out.println("price is " + price);
    }
}