class TouristPlaces {

    public static void main(String[] args){

        String[] places = {
            "Goa","Ooty","Coorg","Mysore","Hampi",
            "Delhi","Agra","Jaipur","Kerala","Manali",
            "Shimla","Ladakh","Varanasi","Rishikesh","Udaipur",
            "Darjeeling","Sikkim","Andaman","Lakshadweep","Kodaikanal",
            "Pondicherry","Hyderabad","Bangalore","Chennai","Mumbai",
            "Pune","Ahmedabad","Kolkata","Bhopal","Indore"
        };

        places[2] = "Paris";

        for(int i=0; i<places.length; i++){
            System.out.println("toiurist place is " +places[i]);
        }

        for(int i=places.length-1; i>=0; i--){
            System.out.println("tourist place is " +places[i]);
        }
    }
}