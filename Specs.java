public class Specs {
    public static void main(String[] args) {
        String frameType = "Full-rim";
        double power = -1.5;
        String lensMaterial = "Polycarbonate";
        boolean isAntiGlare = true;
        String frameColor = "Blue";

        System.out.println("Frame: " + frameType);
        System.out.println("Power: " + power);
        System.out.println("Lens: " + lensMaterial);
        System.out.println("Anti-Glare: " + isAntiGlare);
        System.out.println("Color: " + frameColor);

        frameType = "Rimless";
        power = -2.75;
        lensMaterial = "Glass";
        isAntiGlare = false;
        frameColor = "Silver";

        System.out.println("Updated Frame: " + frameType);
        System.out.println("Updated Power: " + power);
        System.out.println("Updated Lens: " + lensMaterial);
        System.out.println("Updated Anti-Glare: " + isAntiGlare);
        System.out.println("Updated Color: " + frameColor);
    }
}