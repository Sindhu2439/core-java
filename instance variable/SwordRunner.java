class SwordRunner{

   public static void main(String... values){

      SwordRun swordRun = new SwordRun("Warrior", 5);

      Sword sword = swordRun.info();

      sword.details();

      swordRun.show();

   }
}