class PlantNames {

    public static void main(String[] args){

        String[] plants = {
            "Rose","Tulip","Sunflower","Lily","Jasmine",
            "Lotus","Orchid","Hibiscus","Daisy","Lavender",
            "Mint","Basil","Cactus","Aloe","Fern",
            "Bamboo","Neem","Mango","Coconut","Palm",
            "Peepal","Banana","Papaya","Guava","Apple"
        };

        plants[1] = "BlueLotus";

        for(int i=0; i<plants.length; i++){
            System.out.println("plant name is" +plants[i]);
        }

        for(int i=plants.length-1; i>=0; i--){
            System.out.println("plant name is " +plants[i]);
        }
    }
}