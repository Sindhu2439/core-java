class Bat {

    static void batInfo() {
        byte size = 7;
        short weight = 900;
        int price = 1500;
        long serialNo = 99999L;
        float length = 85.5f;
        double rating = 8.8;
        char grade = 'A';
        boolean available = true;

        System.out.println(size);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(serialNo);
        System.out.println(length);
        System.out.println(rating);
        System.out.println(grade);
        System.out.println(available);
    }

    static void batDetails(int id, String type, double cost, boolean stock) {
        System.out.println(id);
        System.out.println(type);
        System.out.println(cost);
        System.out.println(stock);
    }
}