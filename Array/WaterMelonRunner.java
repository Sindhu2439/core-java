class WaterMelonRunner{
     public static void main(String... args){
	 
	    WaterMelonStore watermelonstore= new WaterMelonStore();
	    WaterMelon watermelon1 = new WaterMelon("Green", 5.5, "Round", true, 0, 120.0, "Sweet", "India", 30.5, true);
		
		WaterMelon watermelon2 = new WaterMelon("Dark Green", 6.2, "Oval", false, 120, 150.0, "Very Sweet", "India", 32.0, true);
		WaterMelon watermelon3 = new WaterMelon("Light Green", 4.8, "Round", true, 0, 100.0, "Sweet", "Brazil", 28.5, true);
		WaterMelon watermelon4 = new WaterMelon("Green Striped", 7.0, "Oval", false, 200, 180.0, "Juicy", "USA", 35.0, true);
		WaterMelon watermelon5 = new WaterMelon("Yellow Green", 5.0, "Round", true, 0, 110.0, "Mild Sweet", "India", 29.0, false);
		WaterMelon watermelon6 = new WaterMelon("Dark Green", 6.8, "Oval", false, 150, 170.0, "Sweet", "Mexico", 34.0, true);
		WaterMelon watermelon7 = new WaterMelon("Light Green", 3.9, "Round", true, 0, 90.0, "Less Sweet", "India", 25.0, false);
		WaterMelon watermelon8 = new WaterMelon("Green", 5.7, "Oval", false, 180, 140.0, "Juicy", "Spain", 31.0, true);
		WaterMelon watermelon9 = new WaterMelon("Striped Green", 6.5, "Round", true, 0, 160.0, "Very Sweet", "Australia", 33.0, true);
		WaterMelon watermelon10 = new WaterMelon("Dark Green", 7.2, "Oval", false, 220, 200.0, "Sweet", "USA", 36.0, true);
		WaterMelon watermelon11 = new WaterMelon("Light Green", 4.5, "Round", true, 0, 95.0, "Sweet", "India", 27.5, false);
		WaterMelon watermelon12 = new WaterMelon("Green", 5.9, "Oval", false, 140, 130.0, "Juicy", "Brazil", 30.0, true);
		WaterMelon watermelon13 = new WaterMelon("Striped Green", 6.1, "Round", true, 0, 155.0, "Very Sweet", "Mexico", 32.5, true);
		WaterMelon watermelon14 = new WaterMelon("Dark Green", 7.5, "Oval", false, 250, 210.0, "Sweet", "Spain", 37.0, true);
		WaterMelon watermelon15 = new WaterMelon("Light Green", 3.5, "Round", true, 0, 85.0, "Less Sweet", "India", 24.0, false);
		
		WaterMelon watermelon16 = new WaterMelon("Green", 5.2, "Oval", false, 160, 125.0, "Juicy", "Australia", 29.5, true);
		WaterMelon watermelon17 = new WaterMelon("Striped Green", 6.7, "Round", true, 0, 165.0, "Very Sweet", "USA", 34.0, true);
		WaterMelon watermelon18 = new WaterMelon("Dark Green", 7.8, "Oval", false, 300, 220.0, "Sweet", "Mexico", 38.0, true);
		WaterMelon watermelon19 = new WaterMelon("Light Green", 4.2, "Round", true, 0, 92.0, "Sweet", "India", 26.5, false);
		WaterMelon watermelon20 = new WaterMelon("Green", 5.8, "Oval", false, 170, 135.0, "Juicy", "Brazil", 31.5, true);
	    watermelonstore.store(watermelon1);
		watermelonstore.store(watermelon2);
		watermelonstore.store(watermelon3);
		watermelonstore.store(watermelon4);
		watermelonstore.store(watermelon5);
		watermelonstore.store(watermelon6);
		watermelonstore.store(watermelon7);
		watermelonstore.store(watermelon8);
		watermelonstore.store(watermelon9);
		watermelonstore.store(watermelon10);
		watermelonstore.store(watermelon11);
		watermelonstore.store(watermelon12);
		watermelonstore.store(watermelon13);
		watermelonstore.store(watermelon14);
		watermelonstore.store(watermelon15);
		watermelonstore.store(watermelon16);
		watermelonstore.store(watermelon17);
		watermelonstore.store(watermelon18);
		watermelonstore.store(watermelon19);
		watermelonstore.store(watermelon20);
		
		watermelonstore.update(watermelon1, new WaterMelon("Black", 6.0, "Square", true, 0, 200.0, "Sweet", "India", 31.0, true));
		watermelonstore.update(watermelon10, new WaterMelon("purple", 6.0, "Square", true, 0, 204.0, "Sweet", "India", 31.0, true));
		watermelonstore.display();
	 } 







}