class JuiceRunner {
    public static void main(String[] args) {
        Juice juice = new Juice();
        juice.save("Orange");
        juice.save("Mango");
        juice.save("Apple");
        juice.save("Grape");
        juice.save("Pineapple");
        juice.store("Mango");
        juice.store("Watermelon");
    }
}