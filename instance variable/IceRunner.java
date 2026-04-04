class IceRunner
{
    public static void main(String[] args)
    {
        System.out.println("first Implicit invoking");
        Ice.details(-5,50,5,10,20);
        System.out.println("Second Explicit invoking");
        double temperature=-10;
        double weight=60;
        double size=6;
        double cost=15;
        double meltTime=25;
        Ice.details(temperature,weight,size,cost,meltTime);
    }
}