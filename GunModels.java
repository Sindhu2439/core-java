class GunModels {

    public static void main(String[] args){

        String[] guns = {
            "AK-47","AK-74","M16 Rifle","M4 Carbine","Glock 17",
            "Glock 19","Desert Eagle","MP5","Uzi","Beretta 92",
            "Colt M1911","FN SCAR","Famas Rifle","Steyr AUG","SIG Sauer P226",
            "SIG Sauer P320","Ruger SR9","Remington 870","Mossberg 500","Winchester Model 70",
            "Barrett M82","Dragunov Sniper Rifle","HK416","HK417","CZ 75",
            "Walther PPK","Thompson Submachine Gun","Browning Hi-Power","Springfield XD","Kel-Tec KSG"
        };

        guns[4] = "AK";

        System.out.println("Forward:");
        for(int i=0; i<guns.length; i++){
            System.out.println("gun name is" +guns[i]);
        }

        System.out.println("Reverse:");
        for(int i=guns.length-1; i>=0; i--){
            System.out.println("gun name is " +guns[i]);
        }
    }
}