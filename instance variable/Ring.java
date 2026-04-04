class Ring{
    static void details(double weight,double diameter,double cost,int noOfStones,double size)
    {
        System.out.println("weight"+weight);
        System.out.println("diameter"+diameter);
        System.out.println("cost"+cost);
        System.out.println("noOfStones"+noOfStones);
        System.out.println("size"+size);
        if(weight>=1 && weight<=50)
        {
            System.out.println("weight Validated:");
        }
        else
        {
            System.out.println("weight invalid:");
        }

        if(diameter>=1 && diameter<=10)
        {
            System.out.println("diameter Validated:");
        }
        else
        {
            System.out.println("diameter invalid:");
        }

        if(cost>=100 && cost<=200000)
        {
            System.out.println("cost Validated:");
        }
        else
        {
            System.out.println("cost invalid:");
        }

        if(noOfStones>=0 && noOfStones<=10)
        {
            System.out.println("stones Validated:");
        }
        else
        {
            System.out.println("stones invalid:");
        }

        if(size>=5 && size<=25)
        {
            System.out.println("size Validated:");
        }
        else
        {
            System.out.println("size invalid:");
        }
    }
}