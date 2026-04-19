class CountryRunner {
    public static void main(String[] args){

        CountryStore countryStore = new CountryStore();

        State state1 = new State("Karnataka",60000000,null,null);

        Address address1 = new Address(101,560001,state1);
        President president1 = new President("DroupadiMurmu",65,address1);

        Collector collector1 = new Collector("Sindhu",2010);
        Collector collector2 = new Collector("Puneeth",2011);
        Collector collector3 = new Collector("Samrat",2012);
        Collector collector4 = new Collector("Yashwanth",2013);
        Collector collector5 = new Collector("Varshitha",2014);
        Collector collector6 = new Collector("Tanushree",2015);

        City city1 = new City("Hassan",1,null,state1);
        City city2 = new City("Bangalore",1,null,state1);
        City city3 = new City("Mysuru",1,null,state1);

        District district1 = new District("HassanTown",collector1,city1);
        District district2 = new District("BTM",collector2,city2);
        District district3 = new District("Rajajinagar",collector3,city2);
        District district4 = new District("Kuvempunagar",collector4,city3);
        District district5 = new District("MandyaRoad",collector5,city3);
        District district6 = new District("BelurRoad",collector6,city1);

        District[] d1 = new District[2];
        d1[0] = district1;
        d1[1] = district6;
        city1.districts = d1;
        city1.noOfDistricts = 2;

        District[] d2 = new District[2];
        d2[0] = district2;
        d2[1] = district3;
        city2.districts = d2;
        city2.noOfDistricts = 2;

        District[] d3 = new District[2];
        d3[0] = district4;
        d3[1] = district5;
        city3.districts = d3;
        city3.noOfDistricts = 2;

        City[] cityArray = new City[3];
        cityArray[0] = city1;
        cityArray[1] = city2;
        cityArray[2] = city3;
        state1.cities = cityArray;

        State[] stateArray = new State[1];
        stateArray[0] = state1;

        Country country1 = new Country("India",president1,stateArray);
        state1.country = country1;

        countryStore.save(country1);

        Country resultCountry = countryStore.findByName("India");
        if(resultCountry != null){
            System.out.println("Country found: " + resultCountry.name);
        } else {
            System.out.println("Country not found");
        }

        State resultState = countryStore.findStateByStateName("Karnataka");
        if(resultState != null){
            System.out.println("State found: " + resultState.name);
        } else {
            System.out.println("State not found");
        }

        City[] resultCities = countryStore.findAllCityByStateName("Karnataka");
        if(resultCities != null){
            System.out.println("Cities in the state Karnataka:");
            for(int i = 0; i < resultCities.length; i++){
                if(resultCities[i] != null){
                    System.out.println("City Name: " + resultCities[i].name);
                }
            }
        } else {
            System.out.println("No cities found");
        }

        int count = countryStore.findNoOfDistrictsByCityName("Bangalore");
        if(count > 0){
            System.out.println("Number of districts in Bangalore: " + count);
        } else {
            System.out.println("City not found");
        }

        Country collectorCountry = countryStore.findByCollectorName("Sindhu");
        if(collectorCountry != null){
            System.out.println("Country found by collector name: " + collectorCountry.name);
        } else {
            System.out.println("Collector not found");
        }
    }
}