class AcidRunner{

   public static void main(String... values){

      AcidRun acidRun = new AcidRun("Chemistry Labb", 5);

      Acid acid = acidRun.info();

      acid.details();

      acidRun.show();

   }
}