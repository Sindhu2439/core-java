class LiftRunner {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.save("Hydraulic");
        lift.save("Pneumatic");
        lift.save("Traction");
        lift.save("Scissor");
        lift.save("Freight");
        lift.store("Traction");
        lift.store("Magnetic");
    }
}