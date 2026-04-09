class StarterRunner {
    public static void main(String[] args) {

        Mechanic m1 = new Mechanic("Sindhu", StarterType.ELECTRIC, 2);
        Mechanic m2 = new Mechanic("Puneeth", StarterType.KICK, 4);
        Mechanic m3 = new Mechanic("Rahul", StarterType.REMOTE, 3);

        Mechanic[] mechanics = {m1, m2, m3};

        Starter starter = new Starter("Motor", "Bosch", mechanics);

        starter.display();
    }
}