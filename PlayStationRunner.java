class PlayStationRunner{
    public static void main(String[] args){
        PlayStation p1 = new PlayStation();
        PlayStation p2 = new PlayStation();
        PlayStation p3 = new PlayStation();
        PlayStation p4 = new PlayStation();
        PlayStation p5 = new PlayStation();

        System.out.println(p1.model);
        System.out.println(p1.storage);
        System.out.println(p1.price);
        System.out.println(p1.colour);
        System.out.println(p1.company);

        p1.model = "PS5";
        p2.storage = 825;
        p3.price = 50000;
        p4.colour = "White";
        p5.company = "Sony";

        System.out.println(p1.model);
        System.out.println(p2.storage);
        System.out.println(p3.price);
        System.out.println(p4.colour);
        System.out.println(p5.company);
    }
}