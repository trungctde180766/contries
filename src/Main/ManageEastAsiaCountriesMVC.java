package Main;

import Controller.ManageEastAsiaCountriesController;
import Model.ManageEastAsiaCountriesModel;
import View.ManageEastAsiaCountriesView;
import java.util.Scanner;

public class ManageEastAsiaCountriesMVC {
    public static void main(String[] args) {
        ManageEastAsiaCountriesModel model = new ManageEastAsiaCountriesModel();
        ManageEastAsiaCountriesView view = new ManageEastAsiaCountriesView();
        ManageEastAsiaCountriesController controller = new ManageEastAsiaCountriesController(model, view);

        int choice;
        do {
            Scanner scanner = new Scanner(System.in);
            view.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            controller.processUserChoice(choice);
        } while (choice != 5);
    }
}