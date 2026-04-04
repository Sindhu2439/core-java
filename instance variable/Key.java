class Key{
    static void details(double length,double weight,double cost,int teeth,double thickness)
    {
        System.out.println("length"+length);
        System.out.println("weight"+weight);
        System.out.println("cost"+cost);
        System.out.println("teeth"+teeth);
        System.out.println("thickness"+thickness);
        if(length>=1 && length<=20)
        {
            System.out.println("length Validated:");
        }
        else
        {
            System.out.println("length invalid:");
        }

        if(weight>=1 && weight<=100)
        {
            System.out.println("weight Validated:");
        }
        else
        {
            System.out.println("weight invalid:");
        }

        if(cost>=1 && cost<=500)
        {
            System.out.println("cost Validated:");
        }
        else
        {
            System.out.println("cost invalid:");
        }

        if(teeth>=1 && teeth<=10)
        {
            System.out.println("teeth Validated:");
        }
        else
        {
            System.out.println("teeth invalid:");
        }

        if(thickness>=1 && thickness<=5)
        {
            System.out.println("thickness Validated:");
        }
        else
        {
            System.out.println("thickness invalid:");
        }
    }
}