class Acid{

   String name;
   String formula;
   int strength;

   Acid(String name, String formula, int strength){
      this.name = name;
      this.formula = formula;
      this.strength = strength;
   }

   void details(){
      System.out.println("Acid name: " + this.name);
      System.out.println("Acid formula: " + this.formula);
      System.out.println("Acid strength: " + this.strength);
   }
}