class FileRunner {
    public static void main(String[] args) {

        Document doc1 = new Document("Resume", FileType.PDF, 2);
        Document doc2 = new Document("Notes", FileType.DOCX, 5);
        Document doc3 = new Document("Data", FileType.TXT, 3);

        Document[] documents = {doc1, doc2, doc3};

        File file = new File("MyFolder", "C:\\Docs", documents);

        file.display();
    }
}