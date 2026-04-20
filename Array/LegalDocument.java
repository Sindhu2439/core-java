class LegalDocument extends Document {
    String caseNumber;
    String court;

    LegalDocument(String title, String author, String caseNumber, String court) {
        super(title, author);
        this.caseNumber = caseNumber;
        this.court = court;
        System.out.println("LegalDocument constructor called");
    }

    void show() {
        super.show();
        System.out.println("Case No: " + caseNumber + ", Court: " + court);
    }
}