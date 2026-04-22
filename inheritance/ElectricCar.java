class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric Car is charging");
	}
		
		@Override
		void start(){
			System.out.println("Running start in ElectricCar");
		
    }
}