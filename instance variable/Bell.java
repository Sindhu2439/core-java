class Bell{
    static void details(double weight,double height,double cost,double diameter,double soundLevel)
    {
        System.out.println("weight"+weight);
        System.out.println("height"+height);
        System.out.println("cost"+cost);
        System.out.println("diameter"+diameter);
        System.out.println("soundLevel"+soundLevel);
        if(weight>=1 && weight<=500)
        {
            System.out.println("weight Validated:");
        }
        else
        {
            System.out.println("weight invalid:");
        }

        if(height>=5 && height<=50)
        {
            System.out.println("height Validated:");
        }
        else
        {
            System.out.println("height invalid:");
        }

        if(cost>=100 && cost<=10000)
        {
            System.out.println("cost Validated:");
        }
        else
        {
            System.out.println("cost invalid:");
        }

        if(diameter>=5 && diameter<=40)
        {
            System.out.println("diameter Validated:");
        }
        else
        {
            System.out.println("diameter invalid:");
        }

        if(soundLevel>=10 && soundLevel<=200)
        {
            System.out.println("soundLevel Validated:");
        }
        else
        {
            System.out.println("soundLevel invalid:");
        }
    }
}