class CricketRunner {

    public static void main(String... args) {

        CricketStore store = new CricketStore();

        Cricket cricket1  = new Cricket("Virat Kohli", 12000, 4, "India", 135.5, 6.2, "Batsman", 300, true, 35);
        Cricket cricket2  = new Cricket("Rohit Sharma", 10000, 8, "India", 130.2, 6.5, "Batsman", 280, false, 36);
        Cricket cricket3  = new Cricket("MS Dhoni", 10500, 1, "India", 125.0, 5.8, "WicketKeeper", 350, false, 42);
        Cricket cricket4  = new Cricket("Jasprit Bumrah", 500, 250, "India", 90.5, 4.2, "Bowler", 120, false, 30);
        Cricket cricket5  = new Cricket("Mohammed Shami", 800, 220, "India", 95.0, 4.5, "Bowler", 150, false, 33);
        Cricket cricket6  = new Cricket("Hardik Pandya", 3500, 80, "India", 140.0, 6.8, "AllRounder", 180, false, 31);
        Cricket cricket7  = new Cricket("Shubman Gill", 4000, 2, "India", 135.0, 6.0, "Batsman", 100, false, 25);
        Cricket cricket8  = new Cricket("Rishabh Pant", 3000, 5, "India", 145.0, 7.0, "WicketKeeper", 90, false, 26);
        Cricket cricket9  = new Cricket("Ravindra Jadeja", 2500, 200, "India", 100.0, 4.8, "AllRounder", 220, false, 36);
        Cricket cricket10 = new Cricket("R Ashwin", 2000, 320, "India", 85.0, 3.9, "Bowler", 250, false, 37);
        Cricket cricket11 = new Cricket("KL Rahul", 4500, 3, "India", 132.0, 5.9, "Batsman", 180, false, 32);
        Cricket cricket12 = new Cricket("Suryakumar Yadav", 3800, 1, "India", 175.0, 7.2, "Batsman", 140, false, 33);
        Cricket cricket13 = new Cricket("Ishan Kishan", 2500, 2, "India", 145.0, 6.6, "WicketKeeper", 110, false, 26);
        Cricket cricket14 = new Cricket("Arshdeep Singh", 300, 120, "India", 110.0, 5.1, "Bowler", 60, false, 25);
        Cricket cricket15 = new Cricket("Yuzvendra Chahal", 600, 200, "India", 98.0, 4.7, "Bowler", 130, false, 34);
        Cricket cricket16 = new Cricket("Axar Patel", 1800, 140, "India", 105.0, 5.0, "AllRounder", 150, false, 30);
        Cricket cricket17 = new Cricket("Washington Sundar", 1200, 90, "India", 115.0, 4.9, "AllRounder", 100, false, 24);
        Cricket cricket18 = new Cricket("Deepak Hooda", 2100, 40, "India", 138.0, 6.1, "AllRounder", 120, false, 29);
        Cricket cricket19 = new Cricket("Umran Malik", 200, 80, "India", 140.0, 6.0, "Bowler", 50, false, 25);
        Cricket cricket20 = new Cricket("Prithvi Shaw", 2600, 0, "India", 150.0, 6.8, "Batsman", 95, false, 26);

        store.store(cricket1);
        store.store(cricket2);
        store.store(cricket3);
        store.store(cricket4);
        store.store(cricket5);
        store.store(cricket6);
        store.store(cricket7);
        store.store(cricket8);
        store.store(cricket9);
        store.store(cricket10);
        store.store(cricket11);
        store.store(cricket12);
        store.store(cricket13);
        store.store(cricket14);
        store.store(cricket15);
        store.store(cricket16);
        store.store(cricket17);
        store.store(cricket18);
        store.store(cricket19);
        store.store(cricket20);

        store.update(cricket3, new Cricket("MSD PRIME", 11000, 5, "India", 130.0, 5.5, "WicketKeeper", 360, true, 43));
        store.update(cricket17, new Cricket("SUNDER PRO", 1500, 100, "India", 120.0, 5.2, "AllRounder", 110, false, 25));

        store.display();
    }
}