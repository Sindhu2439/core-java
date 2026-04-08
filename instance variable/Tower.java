class Tower{

   String name;
   String location;
   int height;

   Tower(String name, String location, int height){
      this.name = name;
      this.location = location;
      this.height = height;
   }

   void details(){
      System.out.println("Tower name: " + this.name);
      System.out.println("Tower location: " + this.location);
      System.out.println("Tower height: " + this.height);
   }
}