class Ticket {

    static double getPriceByPlace(String place){
        System.out.println("executing getPriceByPlace " + place);

        if("Hassan" == place){
            System.out.println("price is 120");
            return 120;
        }
        if("Mysore" == place){
            System.out.println("price is 100");
            return 100;
        }
        if("Banglore" == place){
            System.out.println("price is 150");
            return 150;
        }
        else{
            System.out.println("place not matching");
        }
        return -100;
    }


    static double getPriceByMovie(String movie, String seatType, String theater){
        System.out.println("executing getPriceByMovie " + movie + " " + seatType + " " + theater);

        if("KGF" == movie && "Gold" == seatType && "PVR" == theater){
            System.out.println("price is 300");
            return 300;
        }
        if("Salaar" == movie && "Silver" == seatType && "INOX" == theater){
            System.out.println("price is 250");
            return 250;
        }
        if("Leo" == movie && "Platinum" == seatType && "Cinepolis" == theater){
            System.out.println("price is 350");
            return 350;
        }
        else{
            System.out.println("movie details not matching");
        }
        return -100;
    }


    static String getEmailByName(String name){
        System.out.println("executing getEmailByName " + name);

        if("Ravi" == name){
            return "ravi@gmail.com";
        }
        if("Anu" == name){
            return "anu@gmail.com";
        }
        if("Kiran" == name){
            return "kiran@gmail.com";
        }
        else{
            System.out.println("name not matching");
        }
        return "not found";
    }


    static long getMobileByName(String name){
        System.out.println("executing getMobileByName " + name);

        if("Ravi" == name){
            return 9876543210L;
        }
        if("Anu" == name){
            return 9123456780L;
        }
        if("Kiran" == name){
            return 9988776655L;
        }
        else{
            System.out.println("name not matching");
        }
        return -100;
    }
}