class PenDrive {

    static int getSizeByBrand(String brand){
        System.out.println("executing getSizeByBrand method " + brand);

        if("HP" == brand){
            System.out.println("size is 5");
            return 5;
        }
        if("SanDisk" == brand){
            System.out.println("size is 10");
            return 10;
        }
        if("Sony" == brand){
            System.out.println("size is 15");
            return 15;
        }
        if("Kingston" == brand){
            System.out.println("size is 20");
            return 20;
        }
        if("Samsung" == brand){
            System.out.println("size is 25");
            return 25;
        }
        if("Toshiba" == brand){
            System.out.println("size is 30");
            return 30;
        }
        if("Dell" == brand){
            System.out.println("size is 35");
            return 35;
        }
        if("Lenovo" == brand){
            System.out.println("size is 40");
            return 40;
        }
        if("Adata" == brand){
            System.out.println("size is 45");
            return 45;
        }
        if("Transcend" == brand){
            System.out.println("size is 50");
            return 50;
        }
        else{
            System.out.println("brand not matching");
        }

        return -100;
    }
}