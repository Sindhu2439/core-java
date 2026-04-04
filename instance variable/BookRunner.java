class BookRunner {

    public static void main(String[] args) {

        Book book1 = new Book("Java Basics", "James Gosling", "TechPress", "Programming",
                "English", 350, 499.0, "Blue", "1st", true);

        Book book2 = new Book("Data Structures", "Mark Allen", "CodeWorld", "Education",
                "English", 420, 599.0, "Green", "2nd", false);

        Book book3 = new Book("Algorithms Guide", "Robert Martin", "DevBooks", "Programming",
                "English", 500, 699.0, "Red", "3rd", true);

        book1.show();
        book2.show();
        book3.show();
    }
}