class LuggageRunner {
    public static void main(String[] args) {
        Luggage luggage = new TravelBag();
        luggage.weight();
        TravelBag bag = (TravelBag) luggage;
        bag.wheels();
    }
}