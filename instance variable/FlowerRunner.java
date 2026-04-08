class FlowerRunner{

   public static void main(String... values){

      FlowerRun flowerRun = new FlowerRun("Flower Market", 10);

      Flower flower = flowerRun.info();

      flower.details();

      flowerRun.show();

   }
}