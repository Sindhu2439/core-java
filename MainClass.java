class MainClass {
    public static void main(String[] args) {

        Referator.start();
        Referator.stop();
        Referator.status();

        Train.move();
        Train.stop();
        Train.speed();

        Metal.melt();
        Metal.cut();
        Metal.polish();

        Snake.crawl();
        Snake.hiss();
        Snake.sleep();

        Rocket.launch();
        Rocket.land();
        Rocket.fuel();

        Slipper.wear();
        Slipper.remove();
        Slipper.clean();

        Road.build();
        Road.repair();
        Road.clean();

        HoneyBee.fly();
        HoneyBee.collect();
        HoneyBee.rest();

        Airport.open();
        Airport.close();
        Airport.security();

        HardDisk.read();
        HardDisk.write();
        HardDisk.format();

        System.out.println("All methods executed successfully");
    }
}
