class BoatRunner {
    public static void main(String[] args) {

        Sailor s1 = new Sailor("Sindhu", BoatType.FISHING, 2);
        Sailor s2 = new Sailor("Puneeth", BoatType.SAILING, 4);
        Sailor s3 = new Sailor("Rahul", BoatType.CRUISE, 3);

        Sailor[] sailors = {s1, s2, s3};

        Boat boat = new Boat("SeaQueen", "MotorBoat", sailors);

        boat.display();
    }
}