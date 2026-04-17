class BookRunner {

    public static void main(String... args) {

        BookStore store = new BookStore();

        Book book1 = new Book("Java", "James", 300, 500.0, "Programming", true);
        Book book2 = new Book("Python", "Guido", 280, 450.0, "Programming", true);
        Book book3 = new Book("C++", "Bjarne", 350, 600.0, "Programming", false);
        Book book4 = new Book("DSA", "Mark", 400, 700.0, "Education", true);
        Book book5 = new Book("AI", "Andrew", 320, 650.0, "Technology", true);

        store.store(book1);
        store.store(book2);
        store.store(book3);
        store.store(book4);
        store.store(book5);

        store.update(book2, new Book("Python Advanced", "Guido", 300, 550.0, "Programming", true));

        store.display();
    }
}