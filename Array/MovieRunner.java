class MovieRunner {

    public static void main(String... args) {

        MovieStore store = new MovieStore();

        Movie movie1  = new Movie("RRR", "Action", 9.0, 180, "Telugu", "Rajamouli", 550.0, "NTR", "Alia", true);
        Movie movie2  = new Movie("KGF", "Action", 8.8, 175, "Kannada", "Prashanth", 200.0, "Yash", "Srinidhi", true);
        Movie movie3  = new Movie("Leo", "Action", 7.5, 160, "Tamil", "Lokesh", 300.0, "Vijay", "Trisha", true);
        Movie movie4  = new Movie("Jawan", "Action", 7.9, 165, "Hindi", "Atlee", 350.0, "SRK", "Nayanthara", true);
        Movie movie5  = new Movie("Bahubali", "Epic", 9.2, 200, "Telugu", "Rajamouli", 500.0, "Prabhas", "Anushka", true);
        Movie movie6  = new Movie("Vikram", "Action", 8.5, 150, "Tamil", "Lokesh", 150.0, "Kamal", "Vijay Sethupathi", true);
        Movie movie7  = new Movie("Pushpa", "Action", 8.1, 170, "Telugu", "Sukumar", 180.0, "Allu Arjun", "Rashmika", true);
        Movie movie8  = new Movie("Don", "Comedy", 6.8, 140, "Hindi", "Farhan", 100.0, "Ranveer", "Priyanka", false);
        Movie movie9  = new Movie("3 Idiots", "Drama", 9.3, 170, "Hindi", "Rajkumar", 90.0, "Aamir", "Kareena", true);
        Movie movie10 = new Movie("Master", "Action", 7.8, 160, "Tamil", "Lokesh", 140.0, "Vijay", "Malavika", true);
        Movie movie11 = new Movie("KGF2", "Action", 8.9, 180, "Kannada", "Prashanth", 250.0, "Yash", "Srinidhi", true);
        Movie movie12 = new Movie("Salaar", "Action", 8.0, 175, "Telugu", "Prashanth", 400.0, "Prabhas", "Shruti", true);
        Movie movie13 = new Movie("Dunki", "Drama", 7.2, 150, "Hindi", "Rajkumar", 120.0, "SRK", "Taapsee", true);
        Movie movie14 = new Movie("Beast", "Action", 6.9, 155, "Tamil", "Nelson", 160.0, "Vijay", "Pooja", false);
        Movie movie15 = new Movie("Spider", "Action", 8.3, 145, "English", "Marvel", 1000.0, "Tom", "Zendaya", true);
        Movie movie16 = new Movie("Avengers", "Action", 9.5, 190, "English", "Marvel", 2000.0, "Ironman", "Black Widow", true);
        Movie movie17 = new Movie("Batman", "Action", 8.7, 160, "English", "DC", 800.0, "Batman", "Catwoman", true);
        Movie movie18 = new Movie("Superman", "Action", 8.2, 155, "English", "DC", 750.0, "Clark", "Lois", true);
        Movie movie19 = new Movie("Interstellar", "SciFi", 9.6, 190, "English", "Nolan", 600.0, "Cooper", "Brand", true);
        Movie movie20 = new Movie("Inception", "SciFi", 9.4, 170, "English", "Nolan", 500.0, "Cobb", "Ariadne", true);

        store.store(movie1);
        store.store(movie2);
        store.store(movie3);
        store.store(movie4);
        store.store(movie5);
        store.store(movie6);
        store.store(movie7);
        store.store(movie8);
        store.store(movie9);
        store.store(movie10);
        store.store(movie11);
        store.store(movie12);
        store.store(movie13);
        store.store(movie14);
        store.store(movie15);
        store.store(movie16);
        store.store(movie17);
        store.store(movie18);
        store.store(movie19);
        store.store(movie20);

        store.update(movie4, new Movie("Jawan Updated", "Action", 8.2, 165, "Hindi", "Atlee", 360.0, "SRK", "Nayanthara", true));
        store.update(movie15, new Movie("Spider Updated", "Action", 8.5, 150, "English", "Marvel", 1100.0, "Tom", "Zendaya", true));

        store.display();
    }
}