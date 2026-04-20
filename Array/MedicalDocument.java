class MedicalDocument extends LegalDocument {

    MedicalDocument(String title, String author, String caseNumber, String court) {
        super(title, author, caseNumber, court);
        System.out.println("MedicalDocument constructor called");
    }

    void show() {
        super.show();
    }
}