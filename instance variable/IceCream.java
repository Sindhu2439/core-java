public class IceCream {
    public static void main(String[] args) {
        String flavor = "Vanilla";
        int scoops = 2;
        double price = 4.50;
        boolean inCone = true;
        String topping = "Choco chips";

        System.out.println("Flavor: " + flavor);
        System.out.println("Scoops: " + scoops);
        System.out.println("Price: " + price);
        System.out.println("In Cone: " + inCone);
        System.out.println("Topping: " + topping);

        flavor = "Mango";
        scoops = 1;
        price = 3.00;
        inCone = false;
        topping = "Nuts";

        System.out.println("Updated Flavor: " + flavor);
        System.out.println("Updated Scoops: " + scoops);
        System.out.println("Updated Price: " + price);
        System.out.println("Updated In Cone: " + inCone);
        System.out.println("Updated Topping: " + topping);
    }
}