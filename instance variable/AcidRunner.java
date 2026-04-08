class AcidRunner{

   public static void main(String... values){

      AcidRun acidRun = new AcidRun("Chemistry Lab", 5);

      Acid acid = acidRun.info();

      acid.details();

      acidRun.show();

   }
}