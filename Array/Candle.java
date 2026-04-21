class Candle {
    String color;
    int price;

    Candle() {
        this("White", 50);
        System.out.println("Default Candle");
    }

    Candle(String color, int price) {
        this.color = color;
        this.price = price;
        System.out.println("Parameterized Candle");
    }
}