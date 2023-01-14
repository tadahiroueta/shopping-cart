import java.util.ArrayList;

// Stores information about a collection (list) of Items for sale

public class Catalog{
    
    private String name;
    private ArrayList<Item> items;

    
    /** Constructor that takes the name of this catalog as a parameter */
    public Catalog(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    } 	 


    /** Adds an item to the catalog (list) */
    public void add(Item item) {
        items.add(item);
    }
    
    
    /** Returns the number of items in this list. */
    public int size() {
        return items.size();
    }


    /** Returns the item at the supplied index. */
    public Item get(int index) {
        return items.get(index);
    }

    /** Returns the name of this catalog. */
    public String getName() {
        return name;
    }

} 