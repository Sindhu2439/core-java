1)class is a blueprint used to create instance which has 4 principles .it is used by another class as a variables

2)class Car{
  String brand;
  String color;
  int milage;
   Car(){
      System.out.println("this is a default constructor");
   
   
   }
   
   void display(){
    System.out.println("brand"+this.brand);
	System.out.println("color"+this.color);
	System.out.println("milage"+this.milage);
   
   
   
   }
  public static void main(String[] args) {
  
       Car car=new Car();
	   car.brand="Mahindra";
	   car.color="Red";
	   car.milage=34;
       System.out.println("milage"+car.milage);
   System.out.println("brand"+car.brand);
	System.out.println("color"+car.color);
  }



}


3)method is a function used to perform specific task inside a class

4)method overloading is a method invoking which has same method name, different parameters

5)constructor is a special method which is used to initialize instance variables and to do chaining


6)types of constructor


             1)defualt constructor 
             2)parameterized constructor
7)this keywpord referes to current object of the class which referes instance variable and call current method and also difference between local variables and instyamce variable


8)  
class Car{
  String name;
  int seats;
   Car(String name, int seats){
       this.name=name;
	   this.seats=seats;
   
   
   }
   
   void display(){
    System.out.println("name"+this.name);
	System.out.println("seats"+this.seats);
	
   
   
   }
  public static void main(String[] args) {
  
       Car car=new Car("Mahindra XUV", 7);
	   car.display();
  }



}

9) class pattern{
        public static void main(String[] args) {
      for(int i=1; i <= 5;i++){
	      for(int j=1; j<=5; j++){
		  
		     System.out.print("*");
		  
		  }
	      System.out.println();
	  }
	  
 
 }
 }
 
 10)  class traingle{
        public static void main(String[] args) {
		
		 n=5;
      for(int i=1; i <= n;i++){
	      for(int j=1; j<=n-1; j++){
		  
		     System.out.print("");
		  
		  }
		  for(k=1;k<=i:k++){
	      System.out.print("*");
	  }
	  }
	  
    System.out.println();
 }
 }
 



