class SandRunner{

   public static void main(String... values){

      SandRun sandRun = new SandRun("Construction Site", 10);

      Sand sand = sandRun.info();

      sand.details();

      sandRun.show();

   }
}