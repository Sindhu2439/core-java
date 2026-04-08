class AcidRun{

   String labName;
   int quantity;

   AcidRun(String labName, int quantity){
      System.out.println("AcidRun constructor");
      this.labName = labName;
      this.quantity = quantity;
   }

   void show(){
      System.out.println("Lab name " + this.labName);
      System.out.println("Quantity " + this.quantity);
   }

   public Acid info(){

      Acid acid = new Acid("Sulfuric Acid","H2SO4",10);
      return acid;

   }
}