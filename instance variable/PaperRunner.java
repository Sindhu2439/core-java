class PaperRunner
{
    public static void main(String[] args)
    {
        System.out.println("first Implicit invoking");
        Paper.details(30,80,200,21,2);
        System.out.println("Second Explicit invoking");
        double height=35;
        double weight=90;
        double cost=250;
        double width=25;
        double thickness=3;
        Paper.details(height,weight,cost,width,thickness);
    }
}