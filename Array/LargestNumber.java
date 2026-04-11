public class LargestNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 45, 78, 23, 89, 67};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number: " + largest);
    }
}