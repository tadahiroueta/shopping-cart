/** Bundles together an item and the quantity ordered for that item */

public class ItemOrder {
    
    private Item item;
    private int quantity;
    
    
    /** Constructor that creates an item order for the given item and given quantity. */
    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }


    /** Returns the cost for this item order. */
    public double getPrice() {
        return item.priceFor(quantity);
    }


    /** Returns a reference to the Item in this order. */
    public Item getItem() {
        return item;
    }


    /** <overridden> Returns true if this ItemOrder contains the same Item as the supplied ItemOrder. */
    @Override
    public boolean equals(Object object) {
        return item == ((ItemOrder) object).getItem();
    }

}