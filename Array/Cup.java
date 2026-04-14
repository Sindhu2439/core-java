class Cup {
    String[] names = new String[4];
    int index = 0;

    void save(String name) {
        System.out.println("running display in default constructor");
        if (name != null) {
            if (this.index < names.length) {
                this.names[index] = name;
                System.out.println("name of the cup: " + this.names[index]);
                System.out.println("index of the current name is: " + this.index);
                index++;
            }
        } else {
            System.out.println("name is null");
        }
    }

    void store(String name) {
        boolean found = false;
        if (name != null) {
            System.out.println("name is not null");
            for (String temp : this.names) {
                if (name == temp) {
                    found = true;
                    System.out.println("cup is found");
                    break;
                }
            }
            if (!found) {
                System.out.println("cup is not found");
            }
        } else {
            System.out.println("name is null");
        }
    }
}

