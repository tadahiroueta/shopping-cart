// Basic description of a single item in the shopping cart

public class Item {

    private String name;
    private double price;
    private int bulkQuantity;
    private double bulkPrice;


    /** Overloaded constructor, also takes a bulk quantity and a bulk price as arguments, representing the discounted price (each) if the user buys bulkQty or more items.  Throws an exception if any number is negative, as shown below */
    public Item(
        String name, 
        double price, 
        int bulkQuantity, 
        double bulkPrice
    ) {
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }


    /** Constructor with only name and price parameters. Should utilize the four-parameter constructor below (with a call to this(), i.e. "constructor chaining", see FAQ for more info). */
    public Item(String name, double price) {
        this(name, price, 0, 0);
    }


    /** @return whether it is a bulk item */
    private boolean isBulkItem() {
        return bulkQuantity > 0;
    }


    /** Returns the price for a given quantity of Item (considering bulk price, if applicable). Should throw an IllegalArgumentException if quantity is negative. */
    public double priceFor(int quantity) {
        if (quantity < 0) 
            throw new IllegalArgumentException("Quantity cannot be negative");

        return isBulkItem() ? (quantity / bulkQuantity) * bulkQuantity * bulkPrice + price * (quantity % bulkQuantity) : price * quantity;
    }


    /** 
     * <overridden> Returns a String representation of this item: name followed by a comma and space, followed by $price.
     * If this Item has a bulk price, then you should append an extra space and a parenthesized description of the bulk pricing that has the bulk quantity, the word "for", and the bulk price
     */
    @Override
    public String toString() {
        String noBulkString = String.format("%s, $%.2f", name, price);
        return isBulkItem() ? noBulkString + String.format(" (%d for %.2f)", bulkQuantity, bulkPrice * 10) : noBulkString;
    }
}
