class CoffeeRunner
{
    public static void main(String[] args)
    {
        System.out.println("first Implicit invoking");
        Coffee.details(80,200,120,5,90);
        System.out.println("Second Explicit invoking");
        double temperature=85;
        double quantity=250;
        double price=150;
        double sugar=4;
        double caffeine=100;
        Coffee.details(temperature,quantity,price,sugar,caffeine);
    }
}