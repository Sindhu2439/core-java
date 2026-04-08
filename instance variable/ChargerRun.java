class ChargerRun {

   String name;
   int power;

   ChargerRun(String name, int power){
      System.out.println("ChargerRun constructor");
      this.name = name;
      this.power = power;
   }

   void show(){
      System.out.println("Charger name: " + this.name);
      System.out.println("Charger power: " + this.power);
   }

   public Charger info(){

      Charger charger = new Charger("HP", "Laptop Charger", 150);
      return charger;

   }
}
