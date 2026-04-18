class City {
    String name;
    int noOfDistricts;
    District[] districts;
    State state;

    City(String name, int noOfDistricts, District[] districts, State state) {
        this.name = name;
        this.noOfDistricts = noOfDistricts;
        this.districts = districts;
        this.state = state;
    }
}