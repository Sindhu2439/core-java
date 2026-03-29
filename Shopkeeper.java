class Shopkeeper {

    static int[] sales = {12, 45, 78, 56, 34, 39, 90};
    static int totalSales = 0;

    static void sales() {

        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }

        System.out.println("Total sales: " + totalSales);

        int maxIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxIndex]) {
                maxIndex = i;
            }
        }

        switch (maxIndex) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}

