class SteelRunner{
    public static void main(String[] args){
        Steel steel1 = new Steel();
        Steel steel2 = new Steel();
        Steel steel3 = new Steel();
        Steel steel4 = new Steel();
        Steel steel5 = new Steel();

        System.out.println(steel1.type);
        System.out.println(steel1.grade);
        System.out.println(steel1.weight);
        System.out.println(steel1.price);
        System.out.println(steel1.company);

        steel1.type = "Alloy";
        steel2.grade = 5;
        steel3.weight = 50;
        steel4.price = 200.5;
        steel5.company = "Tata";

        System.out.println(steel1.type);
        System.out.println(steel2.grade);
        System.out.println(steel3.weight);
        System.out.println(steel4.price);
        System.out.println(steel5.company);
    }
}