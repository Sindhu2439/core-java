class Book {
    String title;
    String author;
    int pages;
    double price;
    String genre;
    boolean isAvailable;

    Book(String title, String author, int pages, double price, String genre, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    void show() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Pages: " + this.pages);
        System.out.println("Price: " + this.price);
        System.out.println("Genre: " + this.genre);
        System.out.println("Available: " + this.isAvailable);
        System.out.println("+++++++++++++++++++++++++++++");
    }
}