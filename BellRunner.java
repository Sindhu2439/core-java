class BellRunner
{
    public static void main(String[] args)
    {
        System.out.println("first Implicit invoking");
        Bell.details(200,20,5000,15,80);
        System.out.println("Second Explicit invoking");
        double weight=250;
        double height=22;
        double cost=6000;
        double diameter=18;
        double soundLevel=90;
        Bell.details(weight,height,cost,diameter,soundLevel);
    }
}