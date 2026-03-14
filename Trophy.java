class Trophy {

    static void trophyInfo() {
        byte size = 6;
        short weight = 400;
        int price = 2000;
        long serialNo = 77777L;
        float height = 12.5f;
        double rating = 9.7;
        char grade = 'A';
        boolean shining = true;

        System.out.println(size);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(serialNo);
        System.out.println(height);
        System.out.println(rating);
        System.out.println(grade);
        System.out.println(shining);
    }

    static void trophyDetails(int id, String event, double cost, boolean newOne) {
        System.out.println(id);
        System.out.println(event);
        System.out.println(cost);
        System.out.println(newOne);
    }
}