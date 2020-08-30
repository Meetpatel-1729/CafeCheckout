package cafeCheckout;

import java.util.Scanner;

/**
 * This TimsOrder class is the super class of Coffee, Donut, Mug and Hat
 *
 * @author Meet Patel
 **/

public class TimsOrder {

    // no of the order
    private int size;

    // name of the order giver
    private String name;

    // stores the no. of item
    private static int item;

    // array of timsproduct
    static TimsProduct[] p;

    // set the name and size
    private TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // creates an object of Timsorder
    public static TimsOrder create() {
        System.out.println("Please enter your name: ");
        // TODO: Fill in this stub to have a dialog with the user
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();

        System.out.println("Please enter how much items do you want? ");

        item = sc.nextInt();

        p = new TimsProduct[item];

        for (int i = 0; i < item; i++) {
            System.out.println("Enter your choice of item \n" +
                                "1. Coffee\n" +
                                "2. Donut\n" +
                                "3. Mug\n" +
                                "4. Hat\n" +
                                "Your choice: "
            );
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    p[i] = Coffee.create();
                    break;
                case 2:
                    p[i] = Donut.create();
                    break;
                case 3:
                    p[i] = Mug.create();
                    break;
                case 4:
                    p[i] = Hat.create();
                    break;
                default:
                    System.out.println("Please enter correct choice: ");
                    break;
            }

        }
        TimsOrder t = new TimsOrder(name, item);
        return t;
    }

    // calculate the amount
    public double getAmountDue() {
        double price = 0;
        for (int i = 0; i < item; i++) {

            price += p[i].getRetailPrice();

        }
        return price;

    }

    // print the string
    public String toString() {
        return name ;
    }
}
