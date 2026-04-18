class State {
    String name;
    int population;
    City[] cities;
    Country country;

    State(String name, int population, City[] cities, Country country) {
        this.name = name;
        this.population = population;
        this.cities = cities;
        this.country = country;
    }
}