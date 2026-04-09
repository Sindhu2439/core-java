class Duster {
    String type;
    String brand;
    Student[] student;

    Duster(String type, String brand, Student[] student) {
        this.type = type;
        this.brand = brand;
        this.student = student;
    }

    void display() {
        System.out.println("Type: " + this.type);
        System.out.println("Brand: " + this.brand);

        System.out.println("Students");
        if (this.student != null) {
            for (Student st : this.student) {
                st.show();
            }
        }
    }
}

