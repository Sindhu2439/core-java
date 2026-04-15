class MovieStore {

    Movie[] movies = new Movie[20];
    int index = 0;

    void store(Movie movie) {
        if (movie != null) {
            if (index < movies.length) {
                movies[index] = movie;
                System.out.println("stored at the index " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }
        } else {
            System.out.println("movie cannot be null");
        }
    }

    void display() {
        boolean found = false;

        for (Movie temp : movies) {
            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("unable to display movie values");
        }
    }

    void update(Movie oldName, Movie newName) {
        boolean updated = false;

        if (oldName != null && newName != null) {

            System.out.println("\n================ UPDATE ================\n");

            for (int start = 0; start < movies.length; start++) {

                if (oldName == movies[start]) {

                    System.out.println("replaced at instance : " + (start + 1));

                    System.out.println("OLD INSTANCE:");
                    oldName.show();

                    movies[start] = newName;

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