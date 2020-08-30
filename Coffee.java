package cafeCheckout;

import java.util.Scanner;

/**
 * This Coffee class is the sub class of TimsOrder and implements the consumable
 *
 * @author Meet Patel
 **/

public class Coffee extends TimsProduct implements Consumable {

    // description of the product
    private String description;

    // calorie of the coffee
    private int calorieCount;

    // set all the properties of the coffee
    private Coffee(String name, String description, double cost, double price, int calories) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calories;
    }

    // creates an object of Coffee
    public static Coffee create() {
        System.out.println(
                "Please select your choice: \n" +
                        "1. Hot Chocolate \n" +
                        "2. French Vanila \n" +
                        "Your choice: "
        );
        // TODO: Fill in this stub to have a dialog with the user
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();

        if(choice == 1) {
            return new Coffee("Hot Chocolate", "Taste of Chocolate", 1.99, 4.99, 180);
        }
        else if(choice == 2) {
            return new Coffee("French Vanila", "Taste of french Vanila", 1.59, 4.59, 170);
        }
        else {
            System.out.println("Please choose correct option");
            return null;
        }
    }

    // return the description
    public String getDescription() {
        return description;
    }

    // return the calorie count
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    // return the consumption
    @Override
    public String getConsumptionMethod() {
        return null;
    }

    // print the string
    @Override
    public String toString() {
        return "Description: " + description + " Calorie Count: " + calorieCount;
    }
}
