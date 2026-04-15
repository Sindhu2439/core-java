class Movie {

    String name;
    String genre;
    double rating;
    int duration;
    String language;
    String director;
    double budget;
    String hero;
    String heroine;
    boolean isHit;

    Movie(String name, String genre, double rating, int duration, String language,
          String director, double budget, String hero, String heroine, boolean isHit) {

        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.language = language;
        this.director = director;
        this.budget = budget;
        this.hero = hero;
        this.heroine = heroine;
        this.isHit = isHit;
    }

    void show() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Name: " + this.name);
        System.out.println("Genre: " + this.genre);
        System.out.println("Rating: " + this.rating);
        System.out.println("Duration: " + this.duration + " mins");
        System.out.println("Language: " + this.language);
        System.out.println("Director: " + this.director);
        System.out.println("Budget: " + this.budget);
        System.out.println("Hero: " + this.hero);
        System.out.println("Heroine: " + this.heroine);
        System.out.println("Hit: " + this.isHit);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}