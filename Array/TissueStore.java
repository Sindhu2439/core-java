class TissueStore {

    Tissue[] tissues = new Tissue[20];
    int index = 0;

    void store(Tissue tissue) {

        if (tissue != null) {

            if (index < tissues.length) {

                this.tissues[index] = tissue;
                System.out.println("stored at the index " + index);
                index++;

            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("tissue should contain value cannot process further");
        }
    }

    void display() {

        boolean found = false;

        for (Tissue temp : this.tissues) {

            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("unable to display the tissue values");
        }
    }

    void update(Tissue oldName, Tissue newName) {

        boolean updated = false;

        if (oldName != null && newName != null) {

            System.out.println("\n================ Update================\n");

            for (int start = 0; start < tissues.length; start++) {

                if (oldName == tissues[start]) {

                    System.out.println("replaced at instance : " + (start + 1));

                    System.out.println("OLD INSTANCE:");
                    oldName.show();

                    tissues[start] = newName;

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