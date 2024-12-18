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

    public void setPrice(int inPrice, int total)
    // sets the price
    {
        this.price = inPrice;
        // Conditional statement for the price
        total = 0;
        for (int i = 0; i < price; i++)
            total+= i;
            total = price;
        if (itemName == "Rice" )
        {
            price = 5;
        }
        else if (itemName == "Apple")
        {
            price = 4;
        }
        else if (itemName == "Tomato")
            price = 2;
        else if(itemName == "Soup")
            price = 3;
    }

    public void setQuantity(int inQuantity)
    // sets the quantity
    {
        this.quantity = inQuantity;
        quantity = price *inQuantity;
    }

    // Constructors
    public items()
    {

    }

    public items(String inIteamName, int inPrice, int inQuantity)
    {
        this.itemName = inIteamName;
        this.price = inPrice;
        this.quantity = inQuantity;
    }

    // toString
    public String toString()
    {
        String str;
        str = "Your total is " + price + "\n" + "for these iteam" ;
        return str;
    }

    
}
