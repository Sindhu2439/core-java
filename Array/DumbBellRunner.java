class DumbBellRunner {

    public static void main(String[] args) {

        DumbBell d1 = new DumbBell(5, "Light");
        DumbBell d2 = new DumbBell(10, "Heavy");

        GymDumbBell g1 = new GymDumbBell(5, "Light", "Iron", 2);
        GymDumbBell g2 = new GymDumbBell(10, "Heavy", "Steel", 4);

        SmartDumbBell s1 = new SmartDumbBell(8, "Medium", "Rubber", 2);
        SmartDumbBell s2 = new SmartDumbBell(12, "Heavy", "Steel", 4);

    }
}