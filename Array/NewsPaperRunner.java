class NewsPaperRunner {

    public static void main(String[] args) {

        NewsPaperStore store = new NewsPaperStore();

        NewsPaper np1 = new NewsPaper(Lang.ENGLISH, "High", 5.0, 20, "Times", 30.5, 200, "Header1", "Footer1", 12, 5, "Ravi", "Bangalore", InkColor.BLACK, 10);
		NewsPaper np2 = new NewsPaper(Lang.KANNADA, "Medium", 4.0, 18, "Vijaya", 28.5, 180, "Header2", "Footer2", 11, 4, "Sindhu", "Mysore", InkColor.BLUE, 8);
		NewsPaper np3 = new NewsPaper(Lang.HINDI, "Low", 3.0, 15, "Dainik", 27.0, 150, "Header3", "Footer3", 10, 3, "Puneeth", "Delhi", InkColor.RED, 7);
		NewsPaper np4 = new NewsPaper(Lang.ENGLISH, "High", 6.0, 25, "Herald", 31.0, 210, "Header4", "Footer4", 13, 6, "Tanushree ", "Mumbai", InkColor.BLACK, 12);
		NewsPaper np5 = new NewsPaper(Lang.TAMIL, "Medium", 4.5, 19, "DinaThanthi", 29.0, 170, "Header5", "Footer5", 11, 5, "Varshitha", "Chennai", InkColor.BLUE, 9);
		NewsPaper np6 = new NewsPaper(Lang.TELUGU, "Low", 3.5, 16, "Eenadu", 28.0, 160, "Header6", "Footer6", 10, 4, "Yashwanth", "Hyderabad", InkColor.RED, 8);
		NewsPaper np7 = new NewsPaper(Lang.KANNADA, "High", 5.5, 22, "Prajavani", 30.0, 190, "Header7", "Footer7", 12, 6, "Sumanth", "Bangalore", InkColor.BLACK, 11);
		NewsPaper np8 = new NewsPaper(Lang.ENGLISH, "Medium", 4.2, 17, "Deccan", 27.5, 155, "Header8", "Footer8", 11, 4, "Mahima", "Pune", InkColor.BLUE, 7);
		NewsPaper np9 = new NewsPaper(Lang.HINDI, "Low", 3.8, 14, "Jagran", 26.5, 140, "Header9", "Footer9", 10, 3, "Ankith", "Lucknow", InkColor.RED, 6);
		NewsPaper np10 = new NewsPaper(Lang.ENGLISH, "High", 6.2, 26, "Express", 32.0, 220, "Header10", "Footer10", 14, 7, "Sinchana", "Delhi", InkColor.BLACK, 13);

        store.save(np1);
        store.save(np2);
        store.save(np3);
		store.save(np4);
		store.save(np5);
		store.save(np6);
		store.save(np7);
		store.save(np8);
		store.save(np9);
		store.save(np10);
		
		
		String ref1=store.findPaperQualityByName("Times");
		System.out.println(ref1);
		int ref2=store.findNoOfPagesByNameAndHeadEditor("Vijaya", "Sindhu");
		System.out.println(ref2);
		store.updateLangByName("Times", Lang.TAMIL);
		store.updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(InkColor.GREEN, 10, 15, "Times", 30.5, 200);
		NewsPaper ref3=new NewsPaper(Lang.TELUGU, "High", 6.0, 25, "Mother", 31.0, 210, "Header8", "Footer8", 14, 6, "Samrat", "Karnataka", InkColor.BLACK, 12);
		store.replaceByPrintHouseAddress("Delhi",ref3);

		store.displayAll();
		
		
		

}}