class Screw {

    static void screwInfo() {
        byte length = 4;
        short weight = 30;
        int price = 20;
        long serialNo = 44444L;
        float diameter = 1.5f;
        double strength = 7.8;
        char grade = 'C';
        boolean available = true;

        System.out.println(length);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(serialNo);
        System.out.println(diameter);
        System.out.println(strength);
        System.out.println(grade);
        System.out.println(available);
    }

    static void screwDetails(int id, String material, double cost, boolean stock) {
        System.out.println(id);
        System.out.println(material);
        System.out.println(cost);
        System.out.println(stock);
    }
}