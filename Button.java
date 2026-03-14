public class Button {
    public static void main(String[] args) {
        String shape = "Round";
        String material = "Plastic";
        int holes = 4;
        double diameter = 1.5;
        String color = "Red";

        System.out.println("Shape: " + shape);
        System.out.println("Material: " + material);
        System.out.println("Holes: " + holes);
        System.out.println("Diameter: " + diameter);
        System.out.println("Color: " + color);

        shape = "Square";
        material = "Metal";
        holes = 2;
        diameter = 2.0;
        color = "Gold";

        System.out.println("New Shape: " + shape);
        System.out.println("New Material: " + material);
        System.out.println("New Holes: " + holes);
        System.out.println("New Diameter: " + diameter);
        System.out.println("New Color: " + color);
    }
}