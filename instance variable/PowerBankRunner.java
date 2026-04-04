class PowerBankRunner{
    public static void main(String[] args){
        PowerBank p1 = new PowerBank();
        PowerBank p2 = new PowerBank();
        PowerBank p3 = new PowerBank();
        PowerBank p4 = new PowerBank();
        PowerBank p5 = new PowerBank();

        System.out.println(p1.brand);
        System.out.println(p1.capacity);
        System.out.println(p1.price);
        System.out.println(p1.colour);
        System.out.println(p1.ports);

        p1.brand = "Mi";
        p2.capacity = 20000;
        p3.price = 1500;
        p4.colour = "Black";
        p5.ports = 2;

        System.out.println(p1.brand);
        System.out.println(p2.capacity);
        System.out.println(p3.price);
        System.out.println(p4.colour);
        System.out.println(p5.ports);
    }
}