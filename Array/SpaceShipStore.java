class SpaceShipStore {

    SpaceShip[] spaceShips = new SpaceShip[20];
    int index = 0;

    void store(SpaceShip ship) {

        if (ship != null) {

            if (index < spaceShips.length) {

                this.spaceShips[index] = ship;
                System.out.println("stored at the index " + index);
                index++;

            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("spaceShip cannot be null");
        }
    }

    void display() {

        boolean found = false;

        for (SpaceShip temp : spaceShips) {

            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("unable to display spaceship data");
        }
    }

    void update(SpaceShip oldName, SpaceShip newName) {

        boolean updated = false;

        if (oldName != null && newName != null) {

            System.out.println("\n================ Update ================\n");

            for (int start = 0; start < spaceShips.length; start++) {

                if (oldName == spaceShips[start]) {

                    System.out.println("replaced at instance : " + (start + 1));

                    System.out.println("OLD INSTANCE:");
                    oldName.show();

                    spaceShips[start] = newName;

                    System.out.println("NEW INSTANCE:");
                    newName.show();

                    System.out.println("\n================ End ================\n");

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