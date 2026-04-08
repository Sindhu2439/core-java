class Day{

   String name;
   String weather;
   int temperature;

   Day(String name, String weather, int temperature){
      this.name = name;
      this.weather = weather;
      this.temperature = temperature;
   }

   void details(){
      System.out.println("Day name: " + this.name);
      System.out.println("Weather: " + this.weather);
      System.out.println("Temperature: " + this.temperature);
   }
}