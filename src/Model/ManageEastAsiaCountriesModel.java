package Model;

import countries.EastAsiaCountries;
import java.util.ArrayList;
import java.util.List;

public class ManageEastAsiaCountriesModel {
    private List<EastAsiaCountries> countries;

    public ManageEastAsiaCountriesModel() {
        countries = new ArrayList<>();
    }

    public void addCountry(EastAsiaCountries country) {
        countries.add(country);
    }

    public List<EastAsiaCountries> getCountries() {
        return countries;
    }

    public EastAsiaCountries[] searchCountryByName(String name) {
        List<EastAsiaCountries> result = new ArrayList<>();
        for (EastAsiaCountries country : countries) {
            if (country.getCountryName().equalsIgnoreCase(name)) {
                result.add(country);
            }
        }
        return result.toArray(new EastAsiaCountries[0]);
    }

    public void sortCountriesByName() {
        countries.sort((c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));
    }
}