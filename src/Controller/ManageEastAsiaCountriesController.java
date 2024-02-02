package Controller;

import Model.ManageEastAsiaCountriesModel;
import View.ManageEastAsiaCountriesView;
import countries.EastAsiaCountries;

public class ManageEastAsiaCountriesController {
    private ManageEastAsiaCountriesModel model;
    private ManageEastAsiaCountriesView view;

    public ManageEastAsiaCountriesController(ManageEastAsiaCountriesModel model, ManageEastAsiaCountriesView view) {
        this.model = model;
        this.view = view;
    }

    public void processUserChoice(int choice) {
        switch (choice) {
            case 1:
                EastAsiaCountries country = view.inputCountryInformation();
                if (country != null) {
                    model.addCountry(country);
                } else {
                    view.displayErrorMessage("Invalid country information.");
                }
                break;
            case 2:
                view.displayCountries(model.getCountries());
                break;
            case 3:
                // Code to search countries by name
                break;
            case 4:
                model.sortCountriesByName();
                view.displayCountries(model.getCountries());
                break;
            case 5:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            default:
                view.displayErrorMessage("Invalid choice. Please enter a number from 1 to 5.");
        }
    }
}