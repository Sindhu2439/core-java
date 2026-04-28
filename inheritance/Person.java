class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor");
    }

    void showPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("Employee constructor");
    }

    void showSalary() {
        System.out.println(name + "'s Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
        System.out.println("Manager constructor");
    }

    void manage() {
        System.out.println(name + " manages " + department + " department");
    }
}

class PersonRunner {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", 35, 90000, "IT");

        m.showPerson();
        m.showSalary();
        m.manage();
    }
}