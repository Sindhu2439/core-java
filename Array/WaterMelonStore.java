class WaterMelonStore {

    private WaterMelon[] watermelons = new WaterMelon[20];
    private int index = 0;

    void store(WaterMelon watermelon) {

        if (watermelon == null) {
            System.out.println("Invalid input: Watermelon cannot be null");
            return;
        }

        if (index >= watermelons.length) {
            System.out.println("Storage is full");
            return;
        }

        watermelons[index] = watermelon;
        System.out.println("Stored at index: " + index);
        index++;
    }

    void display() {

        boolean found = false;

        System.out.println("\n========= WATERMELON LIST =========\n");

        for (WaterMelon w : watermelons) {
            if (w != null) {
                w.show();
                System.out.println("----------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No watermelons available to display");
        }

        System.out.println("\n===================================\n");
    }

    void update(WaterMelon oldObj, WaterMelon newObj) {

        if (oldObj == null || newObj == null) {
            System.out.println("Update failed: objects cannot be null");
            return;
        }

        boolean updated = false;

        System.out.println("\n========= UPDATE OPERATION =========\n");

        for (int i = 0; i < watermelons.length; i++) {

            if (watermelons[i] == oldObj) {

                System.out.println("Instance replaced at position: " + (i + 1));

                System.out.println("OLD INSTANCE:");
                oldObj.show();

                watermelons[i] = newObj;

                System.out.println("NEW INSTANCE:");
                newObj.show();

                System.out.println("\n===================================\n");

                updated = true;
                break;
            }
        }

        if (!updated) {
            System.out.println("Update failed: object not found in store");
        }
    }
}