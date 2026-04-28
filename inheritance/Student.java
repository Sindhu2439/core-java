class Student {
    String name;

    Student(String name) {
        this.name = name;
        System.out.println("Student constructor");
    }

    void showStudent() {
        System.out.println("Student Name: " + name);
    }
}

class GraduateStudent extends Student {
    String degree;

    GraduateStudent(String name, String degree) {
        super(name);
        this.degree = degree;
        System.out.println("GraduateStudent constructor");
    }

    void showDegree() {
        System.out.println(name + " is studying " + degree);
    }
}

class PhDStudent extends GraduateStudent {
    String researchTopic;

    PhDStudent(String name, String degree, String researchTopic) {
        super(name, degree);
        this.researchTopic = researchTopic;
        System.out.println("PhDStudent constructor");
    }

    void research() {
        System.out.println(name + " is researching " + researchTopic);
    }
}

class StudentRunner {
    public static void main(String[] args) {
        PhDStudent s = new PhDStudent("Ananya", "Computer Science", "Artificial Intelligence");

        s.showStudent();
        s.showDegree();
        s.research();
    }
}