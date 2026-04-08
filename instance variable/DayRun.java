class DayRun{

   String activity;
   int hours;

   DayRun(String activity, int hours){
      System.out.println("DayRun constructor");
      this.activity = activity;
      this.hours = hours;
   }

   void show(){
      System.out.println("Activity " + this.activity);
      System.out.println("Hours " + this.hours);
   }

   public Day info(){

      Day day = new Day("Monday","Sunny",30);
      return day;

   }
}