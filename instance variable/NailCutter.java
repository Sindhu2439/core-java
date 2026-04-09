class NailCutter {
    String type;
	String brand;
    Username[] username;
    

    NailCutter(String type,String brand, Username[] username) {
        this.type = type;
		this.brand= brand;
        this.username = username;
    }

    void display() {
        System.out.println("Type: " + this.type);
		System.out.println("brand: " + this.brand);

        System.out.println("users");
        if (this.username != null) {
            for (Username us : this.username) {
                us.show();
            }
        }
    }
}