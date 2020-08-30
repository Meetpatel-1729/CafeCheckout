package cafeCheckout;

/**
 * This is an interface Consumable to use multiple inheritance
 *
 * @author Meet Patel
 **/

interface Consumable {

    // To get the calorie count
    public abstract int getCalorieCount();

    // To get the consumption
    public abstract String getConsumptionMethod();
}
