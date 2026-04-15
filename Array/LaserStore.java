class LaserStore {

    Laser[] lasers = new Laser[20];
    int index = 0;

    void store(Laser laser) {

        if (laser != null) {

            if (index < lasers.length) {

                this.lasers[index] = laser;
                System.out.println("stored at the index " + index);
                index++;

            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("laser should contain value cannot process further");
        }
    }

    void display() {

        boolean found = false;

        for (Laser temp : this.lasers) {

            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("unable to display the laser values");
        }
    }

    void update(Laser oldName, Laser newName) {

        boolean updated = false;

        if (oldName != null && newName != null) {

            System.out.println("\n================ Update================\n");

            for (int start = 0; start < lasers.length; start++) {

                if (oldName == lasers[start]) {

                    System.out.println("replaced at instance : " + (start + 1));

                    System.out.println("OLD INSTANCE:");
                    oldName.show();

                    lasers[start] = newName;

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
            System.out.println("oldname or newname cannot be null");
        }
    }
}