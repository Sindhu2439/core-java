class Armstrong{
	static void arm(int number){
		 int original = number;
		 int sum = 0;
		while(number > 0){
			int digit = number % 10;
			sum = sum + digit*digit*digit;
			number = number/10;
		}
	
	if( original == sum ){
		System.out.println(original+ "is a armstrong");
	}
	else{
		System.out.println(original+ "is not a armstrong");
	}
 }
}