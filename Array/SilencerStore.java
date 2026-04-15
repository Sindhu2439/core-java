class SilencerStore {

    Silencer[] silencers = new Silencer[20];
    int index = 0;

    void store(Silencer silencer) {

        if (silencer != null) {

            if (index < silencers.length) {

                this.silencers[index] = silencer;
                System.out.println("stored at the index " + index);
                index++;

            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("silencer should contain value cannot process further");
        }
    }

    void display() {

        boolean found = false;

        for (Silencer temp : this.silencers) {

            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("unable to display the silencer values");
        }
    }

    void update(Silencer oldName, Silencer newName) {

        boolean updated = false;

        if (oldName != null && newName != null) {

            System.out.println("\n================ Update================\n");

            for (int start = 0; start < silencers.length; start++) {

                if (oldName == silencers[start]) {

                    System.out.println("replaced at instance : " + (start + 1));

                    System.out.println("OLD INSTANCE:");
                    oldName.show();

                    silencers[start] = newName;

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