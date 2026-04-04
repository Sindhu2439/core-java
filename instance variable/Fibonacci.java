class Fibonacci{
	static void fib(int limit){
		int first = 0;
		int second = 1;
		int sum = first + second;
		System.out.println("fist is"+first + "second is "+second);
	     for(int i = 2; i < limit; i++){
			 int next = first + second;
			 System.out.println(next+"is a fibonacci");
			 sum = sum+next;
		     first = second;
			 second = next;
			
		 }
		 System.out.println( );
		System.out.println("fibonnaci"+sum); 
	}
	
}