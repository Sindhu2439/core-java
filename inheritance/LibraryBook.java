class LibraryBook {
    String title;
    boolean isIssued;

    LibraryBook(String title) {
        this.title = title;
        this.isIssued = false;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " issued successfully");
        } else {
            System.out.println(title + " is already issued");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " returned successfully");
        } else {
            System.out.println(title + " was not issued");
        }
    }

    void displayStatus() {
        System.out.println("Book: " + title);
        System.out.println("Issued: " + isIssued);
    }
}

class LibraryRunner {
    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook("Java Programming");
        LibraryBook book2 = new LibraryBook("Data Structures");

        book1.displayStatus();
        book1.issueBook();
        book1.displayStatus();

        book2.displayStatus();
        book2.issueBook();
        book2.returnBook();
        book2.displayStatus();
    }
}