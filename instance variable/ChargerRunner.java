class ChargerRunner {

   public static void main(String... values){

      ChargerRun chargerRun = new ChargerRun("Fast Charger", 65);
      Charger charger = chargerRun.info();

      chargerRun.show();
      charger.details();

   }
}