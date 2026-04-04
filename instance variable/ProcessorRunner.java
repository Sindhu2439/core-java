class ProcessorRunner
{
	public static void main(String[] args)
	{
	 System.out.println("first Implicit invoking");
	 Processor.details(12,4,15.4,23.9,14567.0);
	 System.out.println("Second Explicit invoking");
	 int storage = 34;
	 int generation = 6;
	 double speed = 234;
	 double cost = 23456;
	 double powerConsumption = 345;
	 Processor.details(storage,generation,speed,cost,powerConsumption);
		
	}
	
}