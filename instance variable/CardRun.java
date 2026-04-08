class CardRun{
      String name;
	  int shape;
	  
    CardRun(String name, int no){
	   System.out.println("CardRun constructor");
	   this.name= name;
	   this.shape = shape;
	   
	
	
	
	}
	
	void show(){
	     System.out.println("CardRun name"+ this.name);
		 System.out.println("CardRun shape" +this.shape);
	
	
	}
	
	public Card info(){
	     Card card = new Card("Black","Credit card",23);
		  return card;
	   
	
	
	
	}







}