class Processor{
    static void details(int storage, int gen, double speed, double cost, double power)
	{
		System.out.println("Storage"+storage);
		System.out.println("gen"+gen);
		System.out.println("speed"+speed);
		System.out.println("cost"+cost);
		System.out.println("power"+power);
		if(storage>=1 && storage<=50)
		{
			System.out.println("Storage is Validated: ");
		}
		else
		{
			System.out.println("Storage invalid:");
		}
		if(gen>=1 && gen<=14)
		{
			System.out.println(" gen is Validated:");
		}
		else
		{
			System.out.println("gen invalid:");
		}
		if(speed>=1 && speed<=5)
		{
			System.out.println("Speed Validated:");
		}
		else
		{
			System.out.println("Speed invalid:");
		}
		if(cost>=1 && cost<=50000)
		{
			System.out.println("cost Validated:");
		}
		else
		{
			System.out.println("cost invalid:");
		}
		
		if(power>=10 && power<=5678)
		{
			System.out.println("power Validated:");
		}
		else
		{
			System.out.println("power invalid:");
		}
		
		
	}


               }