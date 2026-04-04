class SpoonRunner
{
    public static void main(String[] args)
    {
        System.out.println("First Implicit invoking");
        Spoon.details(40,120,18,4,2);
        System.out.println("Second Explicit invoking");
        double weight=60;
        double price=150;
        double length=20;
        double width=5;
        double thickness=3;
        Spoon.details(weight,price,length,width,thickness);
    }
}