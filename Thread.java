class Thread {

    void threadInfo() {
        byte length = 5;
        short weight = 50;
        int price = 100;
        long serialNo = 22334L;
        float thickness = 1.2f;
        double quality = 8.5;
        char grade = 'B';
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

    void threadDetails(int id, String color, double size, boolean strong) {
        System.out.println(id);
        System.out.println(color);
        System.out.println(size);
        System.out.println(strong);
    }
}