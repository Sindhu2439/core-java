class PenDriveRunner {

    public static void main(String[] args){

        int size;

        size = PenDrive.getSizeByBrand("HP");
        System.out.println("size is " + size);

        size = PenDrive.getSizeByBrand("SanDisk");
        System.out.println("size is " + size);

        size = PenDrive.getSizeByBrand("Sony");
        System.out.println("size is " + size);

        size = PenDrive.getSizeByBrand("Kingston");
        System.out.println("size is " + size);

        size = PenDrive.getSizeByBrand("Samsung");
        System.out.println("size is " + size);

        size = PenDrive.getSizeByBrand("Toshiba");
        System.out.println("size is " + size);

        size = PenDrive.getSizeByBrand("Dell");
        System.out.println("size is " + size);

        size = PenDrive.getSizeByBrand("Lenovo");
        System.out.println("size is " + size);

        size = PenDrive.getSizeByBrand("Adata");
        System.out.println("size is " + size);

        String brand = "Transcend";
        size = PenDrive.getSizeByBrand(brand);
        System.out.println("size is " + size);

      
        size = PenDrive.getSizeByBrand("Unknown");
        System.out.println("size is " + size);
    }
}