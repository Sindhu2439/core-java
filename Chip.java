class Chip {

    static void chipInfo() {
        byte version = 2;
        short power = 120;
        int price = 1500;
        long serialNo = 33333L;
        float speed = 3.2f;
        double rating = 9.1;
        char grade = 'A';
        boolean available = true;

        System.out.println(version);
        System.out.println(power);
        System.out.println(price);
        System.out.println(serialNo);
        System.out.println(speed);
        System.out.println(rating);
        System.out.println(grade);
        System.out.println(available);
    }

    static void chipDetails(int id, String brand, double cost, boolean stock) {
        System.out.println(id);
        System.out.println(brand);
        System.out.println(cost);
        System.out.println(stock);
    }
}