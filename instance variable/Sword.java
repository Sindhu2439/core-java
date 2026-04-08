class Sword{

   String material;
   String type;
   int length;

   Sword(String material, String type, int length){
      this.material = material;
      this.type = type;
      this.length = length;
   }

   void details(){
      System.out.println("Sword material: " + this.material);
      System.out.println("Sword type: " + this.type);
      System.out.println("Sword length: " + this.length);
   }
}