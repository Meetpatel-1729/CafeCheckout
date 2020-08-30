package cafeCheckout;

/**
* This Test class is the main class which prints the order total.
*
* @author Meet Patel
 **/
public class TestClass {
    /**
     * A method to test the object
     * @param args unused
     */
    public static void main(String[] args) {

        // Creates an object of TimsOrder
        TimsOrder t = TimsOrder.create();

        System.out.println("Summary of Order");
        System.out.println("--------------------------------------");
        System.out.println("Order For: " + t);
        System.out.println("Total Price: " + t.getAmountDue());
        System.out.println("--------------------------------------");
    }
}
