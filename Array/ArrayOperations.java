public class ArrayOperations {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("\nSum: " + sum);

        int largest = arr[0];
        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println("Largest: " + largest);

        int smallest = arr[0];
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println("Smallest: " + smallest);

        System.out.println("Reversed Array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}