class BurgerRun{

   String shopName;
   int quantity;

   BurgerRun(String shopName, int quantity){
      System.out.println("BurgerRun constructor");
      this.shopName = shopName;
      this.quantity = quantity;
   }

   void show(){
      System.out.println("Shop name " + this.shopName);
      System.out.println("Quantity " + this.quantity);
   }

   public Burger info(){

      Burger burger = new Burger("Cheese Burger","Veg",120);
      return burger;

   }
}