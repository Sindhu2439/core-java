class                                    {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Employee constructor");
    }

    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
        System.out.println("Manager constructor");
    }

    void manage() {
        System.out.println(name + " is managing " + department);
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, int id, String language) {
        super(name, id);
        this.language = language;
        System.out.println("Developer constructor");
    }

    void code() {
        System.out.println(name + " is coding in " + language);
    }
}

class EmployeeRunner {
    public static void main(String[] args) {

        Manager manager = new Manager("Sindhu", 101, "IT");
        Developer developer = new Developer("Puneeth", 102, "Java");

        manager.work();
        manager.manage();

        developer.work();
        developer.code();
    }
}