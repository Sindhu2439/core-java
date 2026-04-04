class TicketRunner {

    public static void main(String[] args){

        double price;

        price = Ticket.getPriceByPlace("Hassan");
        System.out.println("price is " + price);

        price = Ticket.getPriceByPlace("Mysore");
        System.out.println("price is " + price);

        price = Ticket.getPriceByPlace("Unknown");
        System.out.println("price is " + price);
		
        price = Ticket.getPriceByPlace("Banglore");
        System.out.println("price is " + price);

        price = Ticket.getPriceByMovie("KGF", "Gold", "PVR");
        System.out.println("price is " + price);

        price = Ticket.getPriceByMovie("Salaar", "Silver", "INOX");
        System.out.println("price is " + price);

        price = Ticket.getPriceByMovie("Wrong", "Seat", "Theater");
        System.out.println("price is " + price);


        String email = Ticket.getEmailByName("Ravi");
        System.out.println("email is " + email);

        email = Ticket.getEmailByName("Anu");
        System.out.println("email is " + email);

        email = Ticket.getEmailByName("Unknown");
        System.out.println("email is " + email);

        long mobile = Ticket.getMobileByName("Ravi");
        System.out.println("mobile is " + mobile);

        mobile = Ticket.getMobileByName("Kiran");
        System.out.println("mobile is " + mobile);

        mobile = Ticket.getMobileByName("Unknown");
        System.out.println("mobile is " + mobile);
    }
}