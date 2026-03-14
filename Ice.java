class Ice{
    static void details(double temperature,double weight,double size,double cost,double meltTime)
    {
        System.out.println("temperature"+temperature);
        System.out.println("weight"+weight);
        System.out.println("size"+size);
        System.out.println("cost"+cost);
        System.out.println("meltTime"+meltTime);
        if(temperature<=0 && temperature>=-50)
        {
            System.out.println("temperature Validated:");
        }
        else
        {
            System.out.println("temperature invalid:");
        }

        if(weight>=1 && weight<=500)
        {
            System.out.println("weight Validated:");
        }
        else
        {
            System.out.println("weight invalid:");
        }

        if(size>=1 && size<=20)
        {
            System.out.println("size Validated:");
        }
        else
        {
            System.out.println("size invalid:");
        }

        if(cost>=1 && cost<=100)
        {
            System.out.println("cost Validated:");
        }
        else
        {
            System.out.println("cost invalid:");
        }

        if(meltTime>=1 && meltTime<=60)
        {
            System.out.println("meltTime Validated:");
        }
        else
        {
            System.out.println("meltTime invalid:");
        }
    }
}