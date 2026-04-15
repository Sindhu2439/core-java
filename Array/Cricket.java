class Cricket {

    String playerName;
    int runs;
    int wickets;
    String team;
    double strikeRate;
    double economy;
    String role;
    int matches;
    boolean isCaptain;
    int age;

    Cricket(String playerName, int runs, int wickets, String team,
            double strikeRate, double economy, String role,
            int matches, boolean isCaptain, int age) {

        this.playerName = playerName;
        this.runs = runs;
        this.wickets = wickets;
        this.team = team;
        this.strikeRate = strikeRate;
        this.economy = economy;
        this.role = role;
        this.matches = matches;
        this.isCaptain = isCaptain;
        this.age = age;
    }

    void show() {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Player Name: " + this.playerName);
        System.out.println("Runs: " + this.runs);
        System.out.println("Wickets: " + this.wickets);
        System.out.println("Team: " + this.team);
        System.out.println("Strike Rate: " + this.strikeRate);
        System.out.println("Economy: " + this.economy);
        System.out.println("Role: " + this.role);
        System.out.println("Matches: " + this.matches);
        System.out.println("Captain: " + this.isCaptain);
        System.out.println("Age: " + this.age);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}