class LuxuryFarmHouse extends FarmHouse {
    String pool;

    LuxuryFarmHouse(String owner, int acres, String pool) {
        super(owner, acres);
        this.pool = pool;
        System.out.println("LuxuryFarmHouse");
    }
}