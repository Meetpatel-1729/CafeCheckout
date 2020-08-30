package cafeCheckout;

import java.awt.*;
import java.util.Scanner;

/**
 * This is a Mug class which is a subclass of TimsProduct
 *
 * @author Meet Patel
 **/

public class Mug extends TimsProduct{

    // color of the mug
    private Color color;

    // set the properties of the mug
    private Mug(String name, Color color, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }

    // creates an object of Mug
    public static Mug create() {
        System.out.println(
                "Please select your choice: \n" +
                        "1. Black \n" +
                        "2. Blue \n" +
                        "Your choice: "
        );
        // TODO: Fill in this stub to have a dialog with the user
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();
        if(choice == 1) {
            return new Mug("Black Mug", Color.BLACK, 2.00, 4.00);
        }
        else if(choice == 2) {
            return new Mug("Blue Mug", Color.BLUE, 1.50, 3.00);
        }
        else {
            System.out.println("Please choose correct option");
        }
        // and create a TimsOrder.
        return null;
    }

    // return the color of the mug
    public Color getColor() {
        return color;
    }

    // print string
    public String toString() {
        return "Mug: " + super.toString() + "Color: " + color;
    }
}
