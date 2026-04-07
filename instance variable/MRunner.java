class MRunner {

    public static void main(String... args) {

        ComputerLab lab = new ComputerLab("Java Lab", 25);  

        lab.monitor = new Monitor(27, "Dell");              
        lab.type = MonitorType.LED;                      

        lab.show();
    }
}