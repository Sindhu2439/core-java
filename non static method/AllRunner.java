class AllRunner {

    public static void main(String[] args) {

        Locket locket1 = new Locket("Tanishq","Gold","Gold",15000,10,"Heart","Flower","Small","India",true);
        Locket locket2 = new Locket("Malabar","Silver","Silver",5000,8,"Oval","Leaf","Medium","India",false);
        Locket locket3 = new Locket("Kalyan","RoseGold","Gold",12000,9,"Round","Stone","Small","Dubai",true);

        locket1.show();
        locket2.show();
        locket3.show();


        Specs1 specs1 = new Specs1("Rayban","Full","Black",4000,"UV",20,"Medium","Round","USA",true);
        Specs1 specs2 = new Specs1("Oakley","Half","Blue",3500,"Normal",18,"Large","Square","USA",false);
        Specs1 specs3 = new Specs1("Fastrack","Full","Grey",2000,"UV",15,"Small","Oval","India",true);

        specs1.show();
        specs2.show();
        specs3.show();


        Chain chain1 = new Chain("Malabar","Gold",20,15,"Gold","Simple",25000,"Neck","India",true);
        Chain chain2 = new Chain("Tanishq","Silver",18,12,"Silver","Designer",12000,"Neck","India",false);
        Chain chain3 = new Chain("Kalyan","Gold",22,16,"RoseGold","Modern",30000,"Neck","Dubai",true);

        chain1.show();
        chain2.show();
        chain3.show();


        Locker locker1 = new Locker("Godrej","Steel",5,"Grey",15000,6,3,"Key","India",false);
        Locker locker2 = new Locker("Secure","Iron",6,"Black",18000,7,4,"Digital","India",true);
        Locker locker3 = new Locker("SafeHome","Steel",4,"White",12000,5,3,"Key","India",false);

        locker1.show();
        locker2.show();
        locker3.show();


        Boomer boomer1 = new Boomer("Boomer","Mint","Green",5,10,"Round","Packet",50,"India",false);
        Boomer boomer2 = new Boomer("Boomer","Strawberry","Pink",5,8,"Round","Packet",40,"India",false);
        Boomer boomer3 = new Boomer("Boomer","Orange","Orange",5,12,"Round","Packet",55,"India",false);

        boomer1.show();
        boomer2.show();
        boomer3.show();


        Rocket1 rocket1 = new Rocket1("PSLV","Solid",320,44,"India",4,28000,"ISRO","Sriharikota",false);
        Rocket1 rocket2 = new Rocket1("GSLV","Liquid",420,49,"India",3,30000,"ISRO","Sriharikota",false);
        Rocket1 rocket3 = new Rocket1("Falcon9","Liquid",550,70,"USA",2,27000,"SpaceX","Florida",true);

        rocket1.show();
        rocket2.show();
        rocket3.show();


        Xerox xerox1 = new Xerox("Canon","X120",12000,"White",10,"Laser",20,"USB","Japan",false);
        Xerox xerox2 = new Xerox("HP","M100",15000,"Black",12,"Laser",25,"WiFi","USA",true);
        Xerox xerox3 = new Xerox("Epson","E200",11000,"Grey",9,"Inkjet",18,"USB","Japan",false);

        xerox1.show();
        xerox2.show();
        xerox3.show();


        SoftDrink softDrink1 = new SoftDrink("CocaCola","Cola","Black",40,500,"Cold","Bottle","USA",false,true);
        SoftDrink softDrink2 = new SoftDrink("Pepsi","Cola","Black",40,500,"Cold","Bottle","USA",false,true);
        SoftDrink softDrink3 = new SoftDrink("Sprite","Lime","Clear",35,500,"Cold","Bottle","USA",false,true);

        softDrink1.show();
        softDrink2.show();
        softDrink3.show();


        InkPad inkPad1 = new InkPad("Camlin","Blue",50,"Small","Square","Plastic","Liquid","Box","India",true);
        InkPad inkPad2 = new InkPad("Faber","Black",60,"Medium","Rectangle","Plastic","Liquid","Box","Germany",true);
        InkPad inkPad3 = new InkPad("Luxor","Red",55,"Small","Square","Plastic","Liquid","Box","India",true);

        inkPad1.show();
        inkPad2.show();
        inkPad3.show();


        Stamp stamp1 = new Stamp("Camlin","Office","Blue",100,"Medium","Rectangle","Rubber","India",true,true);
        Stamp stamp2 = new Stamp("Faber","Official","Black",120,"Large","Square","Rubber","Germany",true,true);
        Stamp stamp3 = new Stamp("Luxor","School","Red",90,"Small","Round","Rubber","India",true,false);

        stamp1.show();
        stamp2.show();
        stamp3.show();


        Umbrella umbrella1 = new Umbrella("Popy","Black",300,40,"Polyester","Rain","Plastic","India",true,true);
        Umbrella umbrella2 = new Umbrella("Sky","Blue",350,42,"Nylon","Rain","Metal","India",true,true);
        Umbrella umbrella3 = new Umbrella("Sun","Red",280,38,"Polyester","Rain","Plastic","India",true,false);

        umbrella1.show();
        umbrella2.show();
        umbrella3.show();


        ArtMaterial artMaterial1 = new ArtMaterial("Camel","Paint","Red",200,"Liquid","Box","Medium","India",true,true);
        ArtMaterial artMaterial2 = new ArtMaterial("Faber","Crayon","Multi",150,"Wax","Packet","Small","Germany",true,true);
        ArtMaterial artMaterial3 = new ArtMaterial("Doms","Sketch","Black",120,"Ink","Box","Small","India",true,true);

        artMaterial1.show();
        artMaterial2.show();
        artMaterial3.show();


        Tyre1 tyre1 = new Tyre1("MRF","Car",5000,16,"Rubber","Radial","India",5,true,true);
        Tyre1 tyre2 = new Tyre1("Apollo","Bike",3000,14,"Rubber","Normal","India",4,true,false);
        Tyre1 tyre3 = new Tyre1("CEAT","Truck",8000,20,"Rubber","Heavy","India",6,true,true);

        tyre1.show();
        tyre2.show();
        tyre3.show();


        WindShield windShield1 = new WindShield("SaintGobain","Car",7000,40,"Glass","LightGreen","France",true,true,true);
        WindShield windShield2 = new WindShield("AIS","Bike",3000,30,"Glass","Clear","India",true,true,false);
        WindShield windShield3 = new WindShield("Guardian","Truck",9000,50,"Glass","LightBlue","USA",true,true,true);

        windShield1.show();
        windShield2.show();
        windShield3.show();


        ThinkPad thinkPad1 = new ThinkPad("Lenovo","T14","i5",16,512,95000,"Black","Windows",14,true);
        ThinkPad thinkPad2 = new ThinkPad("Lenovo","E14","i7",16,1024,110000,"Black","Windows",14,true);
        ThinkPad thinkPad3 = new ThinkPad("Lenovo","L13","i5",8,512,80000,"Black","Windows",13,true);

        thinkPad1.show();
        thinkPad2.show();
        thinkPad3.show();

    }
}