class BroccoliStore {

    Broccoli[] broccolis = new Broccoli[20];
    int index = 0;

    void store(Broccoli broccoli) {

        if (broccoli != null) {

            if (index < broccolis.length) {

                broccolis[index] = broccoli;
                System.out.println("stored at the index " + index);
                index++;

            } else {
                System.out.println("Storage is full ");
            }

        } else {
            System.out.println("broccoli cannot be null ");
        }
    }

    void display() {

        boolean found = false;

        for (Broccoli temp : broccolis) {

            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("unable to display broccoli data");
        }
    }

    void update(Broccoli oldName, Broccoli newName) {

        boolean updated = false;

        if (oldName != null && newName != null) {

            System.out.println("\n================ Update================\n");

            for (int start = 0; start < broccolis.length; start++) {

                if (oldName == broccolis[start]) {

                    System.out.println("replaced at instance : " + (start + 1));

                    System.out.println("OLD INSTANCE:");
                    oldName.show();

                    broccolis[start] = newName;

                    System.out.println("NEW INSTANCE:");
                    newName.show();

                    System.out.println("\n================ End=================\n");

                    updated = true;
                }
            }

            if (!updated) {
                System.out.println("Old instance not found in array");
            }

        } else {
            System.out.println("oldName or newName cannot be null");
        }
    }
}