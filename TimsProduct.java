package assignment7_000794612;

/**
 * This TimsProduct class implements the commodity interface
 * @author Meet Patel
 **/

public class TimsProduct implements Commodity {

    // name of the product
    private String name;

    // cost of the product
    private double cost;

    // actual price of the product
    private double price;


    // set the name, cost and price
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    // return name
    public String getName() {
        return name;
    }

    // return cost of the product
    public double getProductionCost() {
        return cost;
    }

    // return retail price
    public double getRetailPrice() {
        return price;
    }

    // print string
    public String toString() {
        return "Name: " + name + "Cost: " + cost + "Price: " + price ;
    }
}
