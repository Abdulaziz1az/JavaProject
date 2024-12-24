// it is a class of items that returns and set the information
public class items {
    public String itemName; // the name of the item
    public double price; 
    public int quantity;

    // gets and sets
    public String getName()
    // returns the item name
    {
        return itemName;
    }

    public double getPrice()
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

    public void setPrice(double inPrice)
    // sets the price
    {
        this.price = inPrice;
        setPriceBasedOnItemName();
    }

    public void setPriceBasedOnItemName()
    // sets the price on the listed items
    {
        if(this.itemName != null)
         {
            if(this.itemName.equals("Rice"))
                this.price = 5.4;
            else if(this.itemName.equals("Apple"))
                this.price = 4.5;
            else if(this.itemName.equals("Tomato"))
                this.price = 3.2;
            else if(this.itemName.equals("Soup"))
                this.price = 5.2;
         }
    }
    public void setQuantity(int inQuantity)
    // sets the quantity
    {
        this.quantity = inQuantity;
    }

    // Constructors
    public items()
    {
        this.itemName = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    public items(String inItemName, double inPrice, int inQuantity)
    {
        this.itemName = inItemName;
        this.price = inPrice;
        this.quantity = inQuantity;
    }

    //  method to cacluate the total price
    public double cacluateTotatlPrice()
    {
        return price * quantity;
    }

// toString
public String toString()
{
    String str;
    str = "Item: " +itemName + ", price: " + price + ", Quantity: " + quantity;
    return str;
}

    
}
