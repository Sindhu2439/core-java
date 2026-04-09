class Username {
    String name;
    NailType nailtype;
    int idNo;

    Username(String name, NailType nailtype, int idNo) {
        this.name = name;
        this.nailtype = nailtype;
        this.idNo = idNo;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("NailType: " + this.nailtype);
        System.out.println("ID No: " + this.idNo);
        System.out.println();
    }
}