class DiamondRun{

   String shopName;
   int quantity;

   DiamondRun(String shopName, int quantity){
      System.out.println("DiamondRun constructor");
      this.shopName = shopName;
      this.quantity = quantity;
   }

   void show(){
      System.out.println("Shop name " + this.shopName);
      System.out.println("Quantity " + this.quantity);
   }

   public Diamond info(){

      Diamond diamond = new Diamond("White","Round",50000);
      return diamond;

   }
}