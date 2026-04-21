class FinalRunner {

    public static void main(String[] args) {

        Store store = new Store();
        Coin coin = new Coin();
        Stock stock = new Stock();
        Hospital hospital = new Hospital();
        Temple temple = new Temple();

        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant("KFC", "Bangalore");

        Candle candle1 = new Candle();
        Candle candle2 = new Candle("Red", 100);

        SmartFarmHouse farm1 = new SmartFarmHouse("Sindhu", 10, "Yes");
        SmartFarmHouse farm2 = new SmartFarmHouse("Anu", 20, "No");

        Sock sock = new Sock();
        sock.brand = "Puma";
        System.out.println("Sock brand: " + sock.brand);

        Tape tape = new Tape(50);
        System.out.println("Tape length: " + tape.length);

        PodiumChild podium = new PodiumChild();
        podium.displayWinner();
        podium.playNationalAnthem();
        podium.showRankings();
        podium.announceResult();
        podium.endCeremony();

        IpodChild ipod = new IpodChild();
        ipod.playMusic();
        ipod.pauseMusic();
        ipod.nextSong();
        ipod.previousSong();
        ipod.increaseVolume();

        PaintChild paint = new PaintChild();
        paint.applyColor();
        paint.dryPaint();
        paint.mixColor();
        paint.cleanBrush();
        paint.finishPainting();

        UPSChild ups = new UPSChild();
        ups.startPower();
        ups.stopPower();
        ups.chargeBattery();
        ups.checkStatus();
        ups.shutdown();

        StopWatchChild watch = new StopWatchChild();
        watch.startTimer();
        watch.stopTimer();
        watch.resetTimer();
        watch.showTime();
        watch.pauseTimer();

        JerseyChild jersey = new JerseyChild();
        jersey.wearJersey();
        jersey.removeJersey();
        jersey.washJersey();
        jersey.dryJersey();
        jersey.foldJersey();
    }
}