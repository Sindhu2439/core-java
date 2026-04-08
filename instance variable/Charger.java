class Charger {

   String brand;
   String type;
   int watt;

   Charger(String brand, String type, int watt){
      this.brand = brand;
      this.type = type;
      this.watt = watt;
   }

   void details(){

      System.out.println("Charger brand: " + this.brand);
      System.out.println("Charger type: " + this.type);
      System.out.println("Charger watt: " + this.watt);

   }
}