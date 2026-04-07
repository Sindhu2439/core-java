class Factory {

    String ownerName;     
    int workers;          

    SugarCane sugarCane;  
    SugarType type;       

    Factory(String ownerName, int workers) {
        this.ownerName = ownerName;
        this.workers = workers;
    }

    void show() {

        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Workers: " + this.workers);
        System.out.println("Sugar Type: " + this.type);

        if (sugarCane != null) {
            sugarCane.details();
        } 
        else {
            System.out.println("SugarCane is null");
        }
    }
}