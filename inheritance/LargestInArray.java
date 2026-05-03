class LargestInArray {
    public static void main(String[] args) {

        int[] values = {12, 45, 7, 89, 23};
        int largest = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }
        }

        System.out.println("Largest number: " + largest);
    }
}