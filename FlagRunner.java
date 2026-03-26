class FlagRunner{
	public static void main(String[] args){
		Flag flag1 = new Flag();
		Flag flag2 = new Flag();
		Flag flag3 = new Flag();
		Flag flag4 = new Flag();
		Flag flag5 = new Flag();
		System.out.println("the colour of the flag is " +flag1.colour);
		System.out.println("the colour of the flag is " +flag1.noOfStars);
		System.out.println("the colour of the flag is " +flag1.weight);
		System.out.println("the colour of the flag is " +flag1.height);
		System.out.println("the colour of the flag is " +flag1.country);
		
		
		flag1.colour = "Black";
		flag2.noOfStars = 45;
		flag3.weight = 34;
		flag4.height = 4.9;
		flag5.country = "India";
		System.out.println("the colour of the flag is " +flag1.colour);
		System.out.println("the colour of the flag is " +flag2.noOfStars);
		System.out.println("the colour of the flag is " +flag3.weight);
		System.out.println("the colour of the flag is " +flag4.height);
		System.out.println("the colour of the flag is " +flag5.country);
		
	}
	
	
}