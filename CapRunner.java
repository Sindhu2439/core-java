class CapRunner{
    public static void main(String[] args){
        Cap cap1 = new Cap();
        Cap cap2 = new Cap();
        Cap cap3 = new Cap();
        Cap cap4 = new Cap();
        Cap cap5 = new Cap();

        System.out.println(cap1.brand);
        System.out.println(cap1.colour);
        System.out.println(cap1.size);
        System.out.println(cap1.price);
        System.out.println(cap1.material);

        cap1.brand = "Nike";
        cap2.colour = "Black";
        cap3.size = 7;
        cap4.price = 499.5;
        cap5.material = "Cotton";

        System.out.println(cap1.brand);
        System.out.println(cap2.colour);
        System.out.println(cap3.size);
        System.out.println(cap4.price);
        System.out.println(cap5.material);
    }
}
