class Card{

   String color;
   String type;
   int noOfSymbols;
   
   Card(String color, String type, int noOfSymbols){
        this.color= color;
		this.type= type;
		this.noOfSymbols=noOfSymbols;
   }
   
    void details(){
	
	  System.out.println("Card color: " +this.color);
	  System.out.println("Card type: " +this.type);
	  System.out.println("Card noOfSymbols: " +this.noOfSymbols);
	  
	
   
	}
   
   
   



}