class DayRunner{

   public static void main(String... values){

      DayRun dayRun = new DayRun("Study", 5);

      Day day = dayRun.info();

      day.details();

      dayRun.show();

   }
}