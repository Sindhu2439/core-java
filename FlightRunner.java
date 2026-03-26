class FlightRunner{
    public static void main(String[] args){
        Flight f1 = new Flight();
        Flight f2 = new Flight();
        Flight f3 = new Flight();
        Flight f4 = new Flight();
        Flight f5 = new Flight();

        System.out.println(f1.name);
        System.out.println(f1.seats);
        System.out.println(f1.ticketPrice);
        System.out.println(f1.destination);
        System.out.println(f1.airline);

        f1.name = "Flight101";
        f2.seats = 180;
        f3.ticketPrice = 5500;
        f4.destination = "Delhi";
        f5.airline = "Indigo";

        System.out.println(f1.name);
        System.out.println(f2.seats);
        System.out.println(f3.ticketPrice);
        System.out.println(f4.destination);
        System.out.println(f5.airline);
    }
}