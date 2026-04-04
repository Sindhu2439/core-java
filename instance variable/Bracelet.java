public class Bracelet {
    public static void main(String[] args) {
        String material = "Silver";
        double weightGrams = 20.4;
        int beadsCount = 0;
        boolean isAdjustable = false;
        char size = 'M';

        System.out.println("Material: " + material);
        System.out.println("Weight: " + weightGrams);
        System.out.println("Beads: " + beadsCount);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("Size: " + size);

        material = "Thread";
        weightGrams = 5.0;
        beadsCount = 15;
        isAdjustable = true;
        size = 'S';

        System.out.println("New Material: " + material);
        System.out.println("New Weight: " + weightGrams);
        System.out.println("New Beads: " + beadsCount);
        System.out.println("New Adjustable: " + isAdjustable);
        System.out.println("New Size: " + size);
    }
}