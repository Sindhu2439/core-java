class Rupees{

  
  Rupees()
  {
   System.out.println("no arguement constructor");
  
  }
  void info(Coin c){
  
  if(c != null){
  System.out.println("valid" +c);
   c.details();
  
  
  }
  else{
   System.out.println("invalid ");
  
  
  }
  
  }
}