class Diamond{

   String color;
   String shape;
   int price;

   Diamond(String color, String shape, int price){
      this.color = color;
      this.shape = shape;
      this.price = price;
   }

   void details(){
      System.out.println("Diamond color: " + this.color);
      System.out.println("Diamond shape: " + this.shape);
      System.out.println("Diamond price: " + this.price);
   }
}