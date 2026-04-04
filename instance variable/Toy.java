class Toy {

    static void toyInfo() {
        byte size = 3;
        short weight = 80;
        int price = 300;
        long serialNo = 55555L;
        float height = 6.5f;
        double rating = 8.2;
        char grade = 'B';
        boolean available = true;

        System.out.println(size);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(serialNo);
        System.out.println(height);
        System.out.println(rating);
        System.out.println(grade);
        System.out.println(available);
    }

    static void toyDetails(int id, String type, double cost, boolean stock) {
        System.out.println(id);
        System.out.println(type);
        System.out.println(cost);
        System.out.println(stock);
    }
}