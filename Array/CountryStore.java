class CountryStore {

    Country[] countryArray = new Country[10];
    int position = 0;

    void save(Country country) {
        if (country != null) {
            if (position < countryArray.length) {
                countryArray[position] = country;
                System.out.println("Saved at position: " + position);
                position++;
            } else {
                System.out.println("Store is full");
            }
        } else {
            System.out.println("Country is null");
        }
    }

    Country findByName(String name) {
        if (name != null) {
            for (int i = 0; i < countryArray.length; i++) {
                Country country = countryArray[i];
                if (country != null && country.name != null) {
                    if (country.name == name) {
                        return country;
                    }
                }
            }
        }
        return null;
    }

    State findStateByStateName(String stateName) {
        if (stateName != null) {
            for (int i = 0; i < countryArray.length; i++) {
                Country country = countryArray[i];
                if (country != null && country.states != null) {
                    for (int j = 0; j < country.states.length; j++) {
                        State state = country.states[j];
                        if (state != null && state.name != null) {
                            if (state.name == stateName) {
                                return state;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    City[] findAllCityByStateName(String stateName) {
        State state = findStateByStateName(stateName);
        if (state != null && state.cities != null) {
            return state.cities;
        }
        return null;
    }

    int findNoOfDistrictsByCityName(String cityName) {
        if (cityName != null) {
            for (int i = 0; i < countryArray.length; i++) {
                Country country = countryArray[i];
                if (country != null && country.states != null) {
                    for (int j = 0; j < country.states.length; j++) {
                        State state = country.states[j];
                        if (state != null && state.cities != null) {
                            for (int k = 0; k < state.cities.length; k++) {
                                City city = state.cities[k];
                                if (city != null && city.name != null) {
                                    if (city.name == cityName) {
                                        return city.noOfDistricts;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    Country findByCollectorName(String collectorName) {
        if (collectorName != null) {
            for (int i = 0; i < countryArray.length; i++) {
                Country country = countryArray[i];
                if (country != null && country.states != null) {
                    for (int j = 0; j < country.states.length; j++) {
                        State state = country.states[j];
                        if (state != null && state.cities != null) {
                            for (int k = 0; k < state.cities.length; k++) {
                                City city = state.cities[k];
                                if (city != null && city.districts != null) {
                                    for (int m = 0; m < city.districts.length; m++) {
                                        District district = city.districts[m];
                                        if (district != null && district.collector != null) {
                                            if (district.collector.name == collectorName) {
                                                return country;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}