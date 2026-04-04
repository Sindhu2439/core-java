public class Wire {
    public static void main(String[] args) {
        String metal = "Copper";
        double length = 5.0;
        int gauge = 12;
        String insulationColor = "Black";
        boolean isFlexible = true;

        System.out.println("Metal Type: " + metal);
        System.out.println("Length: " + length);
        System.out.println("Gauge: " + gauge);
        System.out.println("Insulation: " + insulationColor);
        System.out.println("Flexible: " + isFlexible);

        metal = "Aluminum";
        length = 10.5;
        gauge = 10;
        insulationColor = "Red";
        isFlexible = false;

        System.out.println("New Metal: " + metal);
        System.out.println("New Length: " + length);
        System.out.println("New Gauge: " + gauge);
        System.out.println("New Insulation: " + insulationColor);
        System.out.println("New Flexible: " + isFlexible);
    }
}