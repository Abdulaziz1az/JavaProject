// it is a class of items that returns and set the information
public class items {
    public String itemName; // the name of the item
    public int price; 
    public int quantity;

    // gets and sets
    public String getName()
    // returns the item name
    {
        return itemName;
    }

    public int getPrice()
    // returns the price
    { 
        return price;
    }

    public int getQuantity()
    // retutns the quantity
    {
        return quantity;
    }

    public void setItemName(String inIteamName)
    // sets the item name
    {
        this.itemName = inIteamName;
    } 

    public void setPrice(int inPrice)
    // sets the price
    {
        this.price = inPrice;
        // Conditional statement for the price
        if (itemName == "Rice" )
        {
            price = 5;
        }
        else if (itemName == "Apple")
        {
            price = 4;
        }
    }

    public void setQuantity(int inQuantity)
    // sets the quantity
    {
        this.quantity = inQuantity;
    }

    
}
