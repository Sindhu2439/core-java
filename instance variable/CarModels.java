class CarModels {

    public static void main(String[] args){

        String[] cars = {
			"BMW", "Benz""Swift","i20","Creta","City","Verna",
            "Civic","Fortuner","Innova","XUV","Nexon",
            "Harrier","Altroz","Punch","Venue","Kushaq",
            "Slavia","Thar","Scorpio","Bolero","Ertiga",
            "Baleno","Glanza","Seltos","Sonet","Compass"
        };

        cars[5] = "Audi";

        for(int i=0; i<cars.length; i++){
            System.out.println("car name is " +cars[i]);
        }

        for(int i=cars.length-1; i>=0; i--){
            System.out.println("car name is " +cars[i]);
        }
    }
}