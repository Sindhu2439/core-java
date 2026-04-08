class LockRunner{

   public static void main(String... values){

      LockRun lockRun = new LockRun("Safety Lock", 10);

      Lock lock = lockRun.info();

      lock.details();

      lockRun.show();

   }
}