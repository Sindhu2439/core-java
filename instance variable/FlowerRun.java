class FlowerRun{

   String shop;
   int quantity;

   FlowerRun(String shop, int quantity){
      System.out.println("FlowerRun constructor");
      this.shop = shop;
      this.quantity = quantity;
   }

   void show(){
      System.out.println("Shop name " + this.shop);
      System.out.println("Quantity " + this.quantity);
   }

   public Flower info(){

      Flower flower = new Flower("Rose","Red",20);
      return flower;

   }
}