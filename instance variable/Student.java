class Student {
    String name;
    DusterType dustertype;
    int idNo;

    Student(String name, DusterType dustertype, int idNo) {
        this.name = name;
        this.dustertype = dustertype;
        this.idNo = idNo;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("DusterType: " + this.dustertype);
        System.out.println("ID No: " + this.idNo);
        System.out.println();
    }
}
