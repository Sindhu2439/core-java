class DocumentRunner {
    public static void main(String[] args) {

        Document doc1 = new Document("Java Notes", "Sindhu");
        Document doc2 = new Document("DSA Notes", "Puneeth");

        LegalDocument legal1 = new LegalDocument("Case File", "Samrat", "C123", "HighCourt");
        LegalDocument legal2 = new LegalDocument("Property Case", "Yashwanth", "C456", "SupremeCourt");

        MedicalDocument med1 = new MedicalDocument("Report1", "Varshitha", "M111", "CityHospital");
        MedicalDocument med2 = new MedicalDocument("Report2", "Tanushree", "M222", "Apollo");

        doc1.show();
        doc2.show();

        legal1.show();
        legal2.show();

        med1.show();
        med2.show();
    }
}