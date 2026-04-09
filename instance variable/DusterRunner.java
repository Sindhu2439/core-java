class DusterRunner {
    public static void main(String[] args) {

        Student student1 = new Student("Sindhu", DusterType.CLOTH, 11);
        Student student2 = new Student("Puneeth", DusterType.MICROFIBER, 22);
        Student student3 = new Student("Rahul", DusterType.FOAM, 33);

        Student[] students = {student1, student2, student3};

        Duster duster = new Duster("Board Cleaner", "Classmate", students);

        duster.display();
    }
}