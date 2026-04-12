class weight{
   public static void main(String... weightss){
   
     System.out.println("name: " +weightss[0]);
	 System.out.println("weight: " +weightss[1]);
	 Integer weightInput=Integer.valueOf(weightss[1]);
	 if(weightInput>=56){
	 
	    System.out.println("weight is normal");
	 
	 }
	 else{
	    
	   System.out.println("weight is abnormal");
	 
	 }
   }

}