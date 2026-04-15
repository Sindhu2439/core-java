class ScreenStore {

    Screen[] screens = new Screen[20];
    int index = 0;

    void store(Screen screen) {
        if (screen != null) {
            if (index < screens.length) {

                this.screens[index] = screen;
                System.out.println("stored at the index " + index);
                index++;

            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("screen should contain value cannot process further");
        }
    }

    void display() {
        boolean found = false;

        for (Screen temp : this.screens) {
            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("unable to display the screen values");
        }
    }

    void update(Screen oldName, Screen newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {

            System.out.println("\n================ Update================\n");

            for (int start = 0; start < screens.length; start++) {

                if (oldName == screens[start]) {

                    System.out.println("repalced at instance : " + (start + 1));

                    System.out.println("OLD INSTANCE:");
                    oldName.show();

                    screens[start] = newName;

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