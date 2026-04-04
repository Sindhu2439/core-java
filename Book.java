class Book {

    String title;
    String author;
    String publisher;
    String genre;
    String language;
    int pages;
    double price;
    String color;
    String edition;
    boolean hardcover;

    Book(String title, String author, String publisher, String genre, String language,
         int pages, double price, String color, String edition, boolean hardcover) {

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.language = language;
        this.pages = pages;
        this.price = price;
        this.color = color;
        this.edition = edition;
        this.hardcover = hardcover;
    }

    void show() {

        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Genre: " + this.genre);
        System.out.println("Language: " + this.language);
        System.out.println("Pages: " + this.pages);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("Edition: " + this.edition);
        System.out.println("Hardcover: " + this.hardcover);

    }
}