class BookStore {

    Book[] books = new Book[20];
    int index = 0;

    void store(Book book) {
        if (book != null) {
            if (index < books.length) {
                books[index] = book;
                System.out.println("stored at index " + index);
                index++;
            } else {
                System.out.println("Storage full");
            }
        } else {
            System.out.println("Book is null");
        }
    }

    void display() {
        boolean found = false;

        for (Book temp : books) {
            if (temp != null) {
                temp.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books to display");
        }
    }

    void update(Book oldName, Book newName) {

        boolean updated = false;

        System.out.println("\n========= Update =========\n");

        for (int start = 0; start < books.length; start++) {

            if (books[start] == oldName) {

                System.out.println("replaced at instance : " + (start + 1));

                System.out.println("OLD:");
                oldName.show();

                books[start] = newName;

                System.out.println("NEW:");
                newName.show();

                System.out.println("\n========= End =========\n");

                updated = true;
            }
        }

        if (!updated) {
            System.out.println("Book not found");
        }
    }
}