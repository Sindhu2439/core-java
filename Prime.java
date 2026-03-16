class Prime{
	static void check(int number){
		int count = 0;
	   for( int i = 1;i <= number;i++){
		   if(number % i == 0){
			   count++;
		   }
	   }
	if(count == 0){
		System.out.println(number+ "is a prime");
	}
	else{
		System.out.println(number+ "is not a prime" );
	}
		
		
	}
	
	   
	   
	   
           }