class Leaf {

    static void leafInfo() {
        byte size = 2;
        short weight = 10;
        int price = 5;
        long serialNo = 66666L;
        float length = 4.3f;
        double freshness = 9.0;
        char grade = 'A';
        boolean green = true;

        System.out.println(size);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(serialNo);
        System.out.println(length);
        System.out.println(freshness);
        System.out.println(grade);
        System.out.println(green);
    }

    static void leafDetails(int id, String plant, double area, boolean fresh) {
        System.out.println(id);
        System.out.println(plant);
        System.out.println(area);
        System.out.println(fresh);
    }
}