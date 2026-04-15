class CricketStore {

    Cricket[] crickets = new Cricket[20];
    int index = 0;

    void store(Cricket cricket) {

        if (cricket != null) {

            if (index < crickets.length) {

                this.crickets[index] = cricket;
                System.out.println("stored at the index " + index);
                index++;

            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("cricket object cannot be null");
        }
    }

    void display() {

        boolean found = false;

        for (Cricket temp : this.crickets) {

            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("unable to display cricket data");
        }
    }

    void update(Cricket oldName, Cricket newName) {

        boolean updated = false;

        if (oldName != null && newName != null) {

            System.out.println("\n================ Update================\n");

            for (int start = 0; start < crickets.length; start++) {

                if (oldName == crickets[start]) {

                    System.out.println("replaced at instance : " + (start + 1));

                    System.out.println("OLD INSTANCE:");
                    oldName.show();

                    crickets[start] = newName;

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