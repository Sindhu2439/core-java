class AgeChecker{
  public static void main(String... values){
 
		System.out.println("name: " +values[0]);
		System.out.println("age: " +values[1]);
		Integer ageInput=Integer.valueOf(values[1]);
		if(ageInput >= 60){
		
		  System.out.println(values[1]+ "is senior age");
		  
		
		}
        else{
		 System.out.println(values[1]+ "is not a senior age");
		
		}
  
  }


}