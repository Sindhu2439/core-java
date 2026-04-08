class Burger{

   String name;
   String type;
   int price;

   Burger(String name, String type, int price){
      this.name = name;
      this.type = type;
      this.price = price;
   }

   void details(){
      System.out.println("Burger name: " + this.name);
      System.out.println("Burger type: " + this.type);
      System.out.println("Burger price: " + this.price);
   }
}