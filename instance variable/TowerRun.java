class TowerRun{

   String company;
   int floors;

   TowerRun(String company, int floors){
      System.out.println("TowerRun constructor");
      this.company = company;
      this.floors = floors;
   }

   void show(){
      System.out.println("TowerRun company " + this.company);
      System.out.println("TowerRun floors " + this.floors);
   }

   public Tower info(){

      Tower tower = new Tower("Sky Tower","Dubai",828);
      return tower;

   }
}