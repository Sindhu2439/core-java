class CountryStore {

    Country[] countries = new Country[10];
    int index = 0;

    void save(Country country) {
        if (country != null && index < countries.length) {
            countries[index++] = country;
        }
    }

    Country findByName(String name) {
        if (name != null) name = name.intern();

        for (Country c : countries) {
            if (c != null && c.name != null && c.name.intern() == name) {
                return c;
            }
        }
        return null;
    }

    State findStateByStateName(String name) {
        if (name != null) name = name.intern();

        for (Country c : countries) {
            if (c != null) {
                for (State s : c.states) {
                    if (s != null && s.name != null && s.name.intern() == name) {
                        return s;
                    }
                }
            }
        }
        return null;
    }

    City[] findAllCityByStateName(String name) {
        if (name != null) name = name.intern();

        for (Country c : countries) {
            if (c != null) {
                for (State s : c.states) {
                    if (s != null && s.name != null && s.name.intern() == name) {
                        return s.cities;
                    }
                }
            }
        }
        return null;
    }

    int findNoOfDistrictsByCityName(String name) {
        if (name != null) name = name.intern();

        for (Country c : countries) {
            if (c != null) {
                for (State s : c.states) {
                    for (City city : s.cities) {
                        if (city != null && city.name != null && city.name.intern() == name) {
                            return city.noOfDistricts;
                        }
                    }
                }
            }
        }
        return 0;
    }

    Country findByCollectorName(String collectorName) {
        if (collectorName != null) collectorName = collectorName.intern();

        for (Country c : countries) {
            if (c != null) {
                for (State s : c.states) {
                    for (City city : s.cities) {
                        for (District d : city.districts) {
                            if (d != null && d.collector != null &&
                                d.collector.name != null &&
                                d.collector.name.intern() == collectorName) {
                                return c;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}