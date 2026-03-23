class LipstickBrand {

    public static void main(String[] args){

        String[] brands = {
			"Insight", "Lakme","Maybelline","Loreal","MAC","Nykaa",
            "Sugar","Revlon","Faces","Colorbar","Chambor"
        };

        brands[3] = "Dior";
		brands[4] = "Lippy"

        System.out.println("Forward:");
        for(int i=0; i<brands.length; i++){
            System.out.println("brand name is" +brands[i]);
        }

        System.out.println("Reverse:");
        for(int i=brands.length-1; i>=0; i--){
            System.out.println("brand name is" +brands[i]);
        }
    }
}