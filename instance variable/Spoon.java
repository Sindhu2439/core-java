class Spoon{
    static void details(double weight,double price,double length,double width,double thickness)
    {
         System.out.println("weight"+weight);
         System.out.println("price"+price);
         System.out.println("length"+length);
         System.out.println("width"+width);
         System.out.println("thickness"+thickness);
        if(weight>=1 && weight<=200)
        {
           System.out.println("weight Validated:");
        }
        else
        {
            System.out.println("weight invalid:");
        }

        if(price>=1 && price<=500)
        {
            System.out.println("price Validated:");
        }
        else
        {
            System.out.println("price invalid:");
        }

        if(length>=5 && length<=25)
        {
            System.out.println("length Validated:");
        }
        else
        {
            System.out.println("length invalid:");
        }

        if(width>=1 && width<=10)
        {
            System.out.println("width Validated:");
        }
        else
        {
            System.out.println("width invalid:");
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