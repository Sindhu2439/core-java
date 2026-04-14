class Library{
    String book[]= new String[6];
	int index=0;
	
   void save(String name){
	   System.out.println("running info in default constructor");
	  
	  
	  
	  if(name!=null){
	  
	    if(this.index<book.length){
		
	  
	  
	    this.book[index] = name;
		System.out.println("name of the book:"+this.book[index]);
		System.out.println("index of the book name"+this.index);
		index++;
		}
		
		
		else{
		System.out.println("memory is full: "+this.book.length);
		
		}
	  
	  
	  }
   }
	  
	  
	void search(String name){
		
		boolean found=false;
		
		if(name!=null){
		
		    for(String temp: this.book){
			
			  if(name == temp){
				found=true;
				System.out.println("book is found");
				break;
				
			                }
			
			
			
	                      	}
		
	        if(!found){
		           System.out.println("book is not found");
		  
	               }
	    
	  
		}
		
		else{
		
		  System.out.println("name is not founs");
		}
   
   }
}

