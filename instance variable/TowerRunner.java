class TowerRunner{

   public static void main(String... values){

      TowerRun towerRun = new TowerRun("Telecom", 50);

      Tower tower = towerRun.info();

      tower.details();

      towerRun.show();

   }
}