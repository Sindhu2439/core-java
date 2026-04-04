class RingRunner{
    public static void main(String[] args)
    {
        System.out.println("first Implicit invoking");
        Ring.details(10,2.5,15000,2,12);
        System.out.println("Second Explicit invoking");
        double weight=12;
        double diameter=3;
        double cost=20000;
        int stones=1;
        double size=13;
        Ring.details(weight,diameter,cost,stones,size);
    }
}