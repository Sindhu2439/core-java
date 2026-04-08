class BurgerRunner{

   public static void main(String... values){

      BurgerRun burgerRun = new BurgerRun("Burger King", 2);

      Burger burger = burgerRun.info();

      burger.details();

      burgerRun.show();

   }
}