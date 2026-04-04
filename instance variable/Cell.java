class Cell {

    static void cellInfo() {
        byte version = 1;
        short power = 200;
        int price = 150;
        long serialNo = 88888L;
        float capacity = 3.7f;
        double rating = 8.9;
        char grade = 'B';
        boolean charged = true;

        System.out.println(version);
        System.out.println(power);
        System.out.println(price);
        System.out.println(serialNo);
        System.out.println(capacity);
        System.out.println(rating);
        System.out.println(grade);
        System.out.println(charged);
    }

    static void cellDetails(int id, String type, double cost, boolean stock) {
        System.out.println(id);
        System.out.println(type);
        System.out.println(cost);
        System.out.println(stock);
    }
}