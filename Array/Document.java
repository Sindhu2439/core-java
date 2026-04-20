class Document {
    String title;
    String author;

    Document(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("Document constructor called");
    }

    void show() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}