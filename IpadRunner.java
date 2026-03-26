class IpadRunner{
    public static void main(String[] args){
        Ipad ipad1 = new Ipad();
        Ipad ipad2 = new Ipad();
        Ipad ipad3 = new Ipad();
        Ipad ipad4 = new Ipad();
        Ipad ipad5 = new Ipad();

        System.out.println(ipad1.model);
        System.out.println(ipad1.storage);
        System.out.println(ipad1.price);
        System.out.println(ipad1.colour);
        System.out.println(ipad1.company);

        ipad1.model = "Air";
        ipad2.storage = 128;
        ipad3.price = 55000;
        ipad4.colour = "Silver";
        ipad5.company = "Apple";

        System.out.println(ipad1.model);
        System.out.println(ipad2.storage);
        System.out.println(ipad3.price);
        System.out.println(ipad4.colour);
        System.out.println(ipad5.company);
    }
}