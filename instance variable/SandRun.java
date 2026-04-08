class SandRun{

   String place;
   int quantity;

   SandRun(String place, int quantity){
      System.out.println("SandRun constructor");
      this.place = place;
      this.quantity = quantity;
   }

   void show(){
      System.out.println("Sand place " + this.place);
      System.out.println("Sand quantity " + this.quantity);
   }

   public Sand info(){

      Sand sand = new Sand("Brown", "River Sand", 50);
      return sand;

   }
}