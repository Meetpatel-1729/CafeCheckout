package cafeCheckout;

import java.awt.*;
import java.util.Scanner;

/**
 * This is a Hat class which is a subclass of TimsProduct
 *
 * @author Meet Patel
 **/

public class Hat extends TimsProduct {

    // set the color
    private Color color;

    // set the properties of the Hat
    private Hat(String name, Color color, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }

    // creates an object of the Hat
    public static Hat create() {
        System.out.println(
                "Please select your choice: \n" +
                        "1. Cow Boy Hat \n" +
                        "2. Winter Hat \n" +
                        "Your choice: "
        );
        // TODO: Fill in this stub to have a dialog with the user
        Scanner sc = new Scanner(System.in);
        int choice;
        choice = sc.nextInt();

        if(choice == 1) {
            return new Hat("Cow Boy Hat",Color.BLACK, 2.00, 7.00);
        }
        else if(choice == 2) {
            return new Hat("Winter Hat",Color.BLUE, 3.00, 8.00);
        }
        else {
            System.out.println("Please choose correct option");
        }
    // and create a TimsOrder.
        return null;
    }

    // return color
    public Color getColor() {
        return color;
    }

    // print string
    @Override
    public String toString() {
        return "Hat: " + super.toString() + "Color: " + color;
    }
}
