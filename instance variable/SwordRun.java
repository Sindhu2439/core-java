class SwordRun{

   String owner;
   int weight;

   SwordRun(String owner, int weight){
      System.out.println("SwordRun constructor");
      this.owner = owner;
      this.weight = weight;
   }

   void show(){
      System.out.println("Sword owner " + this.owner);
      System.out.println("Sword weight " + this.weight);
   }

   public Sword info(){

      Sword sword = new Sword("Steel","Long Sword",40);
      return sword;

   }
}