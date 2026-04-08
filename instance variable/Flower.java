class Flower{

   String name;
   String color;
   int price;

   Flower(String name, String color, int price){
      this.name = name;
      this.color = color;
      this.price = price;
   }

   void details(){
      System.out.println("Flower name: " + this.name);
      System.out.println("Flower color: " + this.color);
      System.out.println("Flower price: " + this.price);
   }
}