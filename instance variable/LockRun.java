class LockRun{

   String name;
   int size;

   LockRun(String name, int size){
      System.out.println("LockRun constructor");
      this.name = name;
      this.size = size;
   }

   void show(){
      System.out.println("LockRun name " + this.name);
      System.out.println("LockRun size " + this.size);
   }

   public Lock info(){

      Lock lock = new Lock("Godrej", "Door Lock", 500);
      return lock;

   }
}