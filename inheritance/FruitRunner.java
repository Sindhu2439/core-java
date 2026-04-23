class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit= new Apple();
        if (fruit instanceof Apple) {
            System.out.println("fruit1 is instance of Apple");
            Apple apple = (Apple) fruit;
            apple.taste();
            apple.color();
        }
    }
}