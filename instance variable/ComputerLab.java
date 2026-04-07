class ComputerLab {

    String labName;        
    int noOfSystems;       

    Monitor monitor;       
    MonitorType type;      

    ComputerLab(String labName, int noOfSystems) {
        this.labName = labName;
        this.noOfSystems = noOfSystems;
    }

    void show() {

        System.out.println("Lab Name: " + this.labName);
        System.out.println("Number of Systems: " + this.noOfSystems);
        System.out.println("Monitor Type: " + this.type);

        if (monitor != null) {
            monitor.display();
        } else {
            System.out.println("Monitor is null");
        }
    }
}