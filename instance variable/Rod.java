class Rod {

  static  void rodInfo() {
        byte length = 10;
        short weight = 200;
        int price = 500;
        long serialNo = 12345L;
        float thickness = 2.5f;
        double quality = 9.5;
        char grade = 'A';
        boolean available = true;

        System.out.println(length);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(serialNo);
        System.out.println(thickness);
        System.out.println(quality);
        System.out.println(grade);
        System.out.println(available);
    }

   static void rodDetails(int id, String material, double cost, boolean stock) {
        System.out.println(id);
        System.out.println(material);
        System.out.println(cost);
        System.out.println(stock);
    }
}