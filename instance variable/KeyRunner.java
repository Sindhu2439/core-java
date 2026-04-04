class KeyRunner
{
    public static void main(String[] args)
    {
        System.out.println("first Implicit invoking");
        Key.details(10,25,120,4,2);
        System.out.println("Second Explicit invoking");
        double length=12;
        double weight=30;
        double cost=150;
        int teeth=5;
        double thickness=3;
        Key.details(length,weight,cost,teeth,thickness);
    }
}