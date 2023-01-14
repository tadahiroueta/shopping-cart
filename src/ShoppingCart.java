import java.util.ArrayList;

/** Stores information about the user's orders */

public class ShoppingCart {

    private ArrayList<ItemOrder> orders;


    /** Constructor that creates an empty list of ItemOrders. */
    public ShoppingCart() {
        orders = new ArrayList<ItemOrder>();
    }


    /** 
     * Adds an ItemOrder to the list, replacing any previous order for this item with the new order.
     * Used when the user updates the quantity of an order for an Item.  Should use calls to corresponding overridden equals methods. 
     * ArrayList's contains method uses a call to the equals method of the type it's storing. The equals method is the way Java tests objects for equivalence – if you haven't overridden a class' equals method, it will use the version inherited from Object!
     */
    public void add(ItemOrder newOrder)	{
        for (int i = 0; i < orders.size(); i++) 
            if (orders.get(i).equals(newOrder)) {
                orders.set(i, newOrder);
                return;
        }
        orders.add(newOrder);
    }


    /** Returns the total cost of the shopping cart. */
    public double getTotal() {
        double total = 0;
        for (ItemOrder order : orders)
            total += order.getPrice();
        return total;
}}
