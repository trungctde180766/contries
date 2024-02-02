package View;

import countries.EastAsiaCountries;
import java.util.List;
import java.util.Scanner;

public class ManageEastAsiaCountriesView {
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Input information for 11 countries in East Asia");
        System.out.println("2. Display information of countries you've just input");
        System.out.println("3. Search information of countries by name");
        System.out.println("4. Display information sorted by country name");
        System.out.println("5. Exit");
    }

    public EastAsiaCountries inputCountryInformation() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter country information:");
        System.out.print("Country Code: ");
        String code = scanner.nextLine();
        System.out.print("Country Name: ");
        String name = scanner.nextLine();
        System.out.print("Total Area: ");
        float area = scanner.nextFloat();
        scanner.nextLine(); // Consume newline
        System.out.print("Country Terrain: ");
        String terrain = scanner.nextLine();

        return new EastAsiaCountries(code, name, area, terrain);
    }


    public void displayCountries(List<EastAsiaCountries> countries) {
        for (EastAsiaCountries country : countries) {
            System.out.println("Country Code: " + country.getCountryCode());
            System.out.println("Country Name: " + country.getCountryName());
            System.out.println("Total Area: " + country.getTotalArea());
            System.out.println("Terrain: " + country.getCountryTerrain());
            System.out.println();
        }
    }

    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}