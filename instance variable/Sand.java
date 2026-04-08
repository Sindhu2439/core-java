class Sand{

   String color;
   String type;
   int weight;

   Sand(String color, String type, int weight){
      this.color = color;
      this.type = type;
      this.weight = weight;
   }

   void details(){
      System.out.println("Sand color: " + this.color);
      System.out.println("Sand type: " + this.type);
      System.out.println("Sand weight: " + this.weight);
   }
}