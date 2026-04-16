class NewsPaper {

    Lang lang;
    String paperQuality;
    double price;
    int noOfPages;
    String name;
    double height;
    double weight;
    String headerText;
    String footerText;
    int fontSize;
    int noOfImages;
    String headEditor;
    String printHouseAddress;
    InkColor inkColor;
    int noOfContents;

    NewsPaper(Lang lang, String paperQuality, double price, int noOfPages, String name,
              double height, double weight, String headerText, String footerText,
              int fontSize, int noOfImages, String headEditor,
              String printHouseAddress, InkColor inkColor, int noOfContents) {

        this.lang = lang;
        this.paperQuality = paperQuality;
        this.price = price;
        this.noOfPages = noOfPages;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.headerText = headerText;
        this.footerText = footerText;
        this.fontSize = fontSize;
        this.noOfImages = noOfImages;
        this.headEditor = headEditor;
        this.printHouseAddress = printHouseAddress;
        this.inkColor = inkColor;
        this.noOfContents = noOfContents;
    }

    void show() {
        System.out.println("========================================");
        System.out.println("Name: " + this.name);
        System.out.println("Lang: " + this.lang);
        System.out.println("Paper Quality: " + this.paperQuality);
        System.out.println("Price: " + this.price);
        System.out.println("Pages: " + this.noOfPages);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
        System.out.println("Header: " + this.headerText);
        System.out.println("Footer: " + this.footerText);
        System.out.println("Font Size: " + this. fontSize);
        System.out.println("Images: " + this.noOfImages);
        System.out.println("Editor: " + this.headEditor);
        System.out.println("Print Address: " + this.printHouseAddress);
        System.out.println("Ink Color: " + this.inkColor);
        System.out.println("Contents: " + this.noOfContents);
        System.out.println("========================================");
    }
}