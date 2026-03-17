class TissuePaper {

    static double getPriceByThickness(String thickness){
        System.out.println("executing getPriceByThickness method " + thickness);

        if("thin" == thickness){
            System.out.println("price is 10");
            return 10.0;
        }
        if("medium" == thickness){
            System.out.println("price is 15");
            return 15.0;
        }
        if("thick" == thickness){
            System.out.println("price is 20");
            return 20.0;
        }
        if("extra thick" == thickness){
            System.out.println("price is 25");
            return 25.0;
        }
        if("soft" == thickness){
            System.out.println("price is 18");
            return 18.0;
        }
        if("ultra soft" == thickness){
            System.out.println("price is 30");
            return 30.0;
        }
        if("double layer" == thickness){
            System.out.println("price is 22");
            return 22.0;
        }
        if("triple layer" == thickness){
            System.out.println("price is 28");
            return 28.0;
        }
        if("premium" == thickness){
            System.out.println("price is 35");
            return 35.0;
        }
        if("eco" == thickness){
            System.out.println("price is 12");
            return 12.0;
        }
        else{
            System.out.println("thickness not matching");
        }

        return -100;
    }
}