class Document {
    String title;
    FileType filetype;
    int size;

    Document(String title, FileType filetype, int size) {
        this.title = title;
        this.filetype = filetype;
        this.size = size;
    }

    void show() {
        System.out.println("Title: " + this.title);
        System.out.println("FileType: " + this.filetype);
        System.out.println("Size: " + this.size);
        System.out.println();
    }
}
