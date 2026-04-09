class File {
    String name;
    String path;
    Document[] document;

    File(String name, String path, Document[] document) {
        this.name = name;
        this.path = path;
        this.document = document;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Path: " + this.path);

        System.out.println("Documents");
        if (this.document != null) {
            for (Document doc : this.document) {
                doc.show();
            }
        }
    }
}
