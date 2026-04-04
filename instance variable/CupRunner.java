class CupRunner{
    public static void main(String[] args){
        Cup c1 = new Cup();
        Cup c2 = new Cup();
        Cup c3 = new Cup();
        Cup c4 = new Cup();
        Cup c5 = new Cup();

        System.out.println(c1.material);
        System.out.println(c1.colour);
        System.out.println(c1.price);
        System.out.println(c1.capacity);
        System.out.println(c1.brand);

        c1.material = "Steel";
        c2.colour = "White";
        c3.price = 120;
        c4.capacity = 250;
        c5.brand = "Milton";

        System.out.println(c1.material);
        System.out.println(c2.colour);
        System.out.println(c3.price);
        System.out.println(c4.capacity);
        System.out.println(c5.brand);
    }
}