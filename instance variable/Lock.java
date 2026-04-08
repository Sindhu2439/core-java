class Lock{

   String brand;
   String type;
   int price;

   Lock(String brand, String type, int price){
      this.brand = brand;
      this.type = type;
      this.price = price;
   }

   void details(){
      System.out.println("Lock brand: " + this.brand);
      System.out.println("Lock type: " + this.type);
      System.out.println("Lock price: " + this.price);
   }
}