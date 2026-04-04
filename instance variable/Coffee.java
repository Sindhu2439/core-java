class Coffee{
    static void details(double temperature,double quantity,double price,double sugar,double caffeine)
    {
        System.out.println("temperature"+temperature);
        System.out.println("quantity"+quantity);
        System.out.println("price"+price);
        System.out.println("sugar"+sugar);
        System.out.println("caffeine"+caffeine);
        if(temperature>=40 && temperature<=100)
        {
            System.out.println("temperature Validated:");
        }
        else
        {
            System.out.println("temperature invalid:");
        }

        if(quantity>=50 && quantity<=500)
        {
            System.out.println("quantity Validated:");
        }
        else
        {
            System.out.println("quantity invalid:");
        }

        if(price>=10 && price<=500)
        {
            System.out.println("price Validated:");
        }
        else
        {
            System.out.println("price invalid:");
        }

        if(sugar>=0 && sugar<=10)
        {
            System.out.println("sugar Validated:");
        }
        else
        {
            System.out.println("sugar invalid:");
        }

        if(caffeine>=10 && caffeine<=200)
        {
            System.out.println("caffeine Validated:");
        }
        else
        {
            System.out.println("caffeine invalid:");
        }
    }
}