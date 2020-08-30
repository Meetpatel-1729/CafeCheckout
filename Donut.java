package assignment7_000794612;

import java.util.Scanner;

/**
 * This is a Donut class which is a subclass of Timsproduct and implements the consumable
 * interface
 *
 * @author Meet Patel
 **/

public class Donut extends TimsProduct implements Consumable{

    // description of the donut
    private String description;

    // calorie count of the donut
    private int calorieCount;

    // set the properties of the donut
    private Donut(String name, String description, double cost, double price, int calories) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calories;
    }

    // creates an object of donut
    public static Donut create() {
        System.out.println(
                "Please select your choice: \n" +
                "1. Apple Fritter \n" +
                "2. Chocolate Dip \n" +
                "Your choice: "
        );

        // TODO: Fill in this stub to have a dialog with the user
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();

        if(choice == 1) {
            return new Donut("Apple Fritter","Apple flavoured donut", 1.50, 3.00, 200);
        }
        else if(choice == 2) {
            return new Donut("Chocolate Dip","Chocolate flavoured donut", 1.50, 3.00, 200);
        }
        else {
            System.out.println("Please choose correct option");
        }
        // and create a TimsOrder.
        return null;
    }

    // return the description of the donut
    public String getDescription() {
        return description;
    }

    // return the calorie count
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    // return the consumption
    public String getConsumptionMethod() {
        return "Eatable";
    }

    // print string
    @Override
    public String toString() {
        return "Donut: " + super.toString() + "Description: " + description + " Calorie count: " + calorieCount + "Consumption method: " + getConsumptionMethod();
    }
}
