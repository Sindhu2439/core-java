class Company {

    static void generate() {
        System.out.println("Company generating plans");
        CEO.supervise();
    }

    public static void main(String[] args) {
        generate();
    }
}

class CEO {

    static void supervise() {
        System.out.println("CEO supervises");
        Executive.execute();
    }

    static void decision() {
        System.out.println("Director decision");
        coordinate();
    }

    static void coordinate() {
        System.out.println("Senior Manager coordinates");
        manage();
    }

    static void manage() {
        System.out.println("Manager manages team");
        develop();
    }

    static void develop() {
        System.out.println("Team developing project");
        guide();
    }

    static void guide() {
        System.out.println("Team Lead guides");
        design();
    }

    static void design() {
        System.out.println("Senior Engineer designs");
        code();
    }

    static void code() {
        System.out.println("Engineer coding");
        cicd();
    }

    static void cicd() {
        System.out.println("DevOps CI/CD pipeline");
    }
}

class Executive {

    static void execute() {
        System.out.println("Executive executes");
        CEO.decision();
    }
}