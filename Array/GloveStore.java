class GloveStore {

    Glove[] gloves = new Glove[20];
    int index = 0;

    void store(Glove glove) {
        if (glove != null) {
            if (index < gloves.length) {
                this.gloves[index] = glove;
                System.out.println("stored at the index " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println("glove cannot be null");
        }
    }

    void display() {
        boolean found = false;

        for (Glove temp : this.gloves) {
            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("unable to display glove values");
        }
    }

    void update(Glove oldName, Glove newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {

            System.out.println("\n================ UPDATE ================\n");

            for (int start = 0; start < gloves.length; start++) {

                if (oldName == gloves[start]) {

                    System.out.println("replaced at instance : " + (start + 1));

                    System.out.println("OLD INSTANCE:");
                    oldName.show();

                    gloves[start] = newName;

                    System.out.println("NEW INSTANCE:");
                    newName.show();

                    System.out.println("\n================ END ================\n");

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