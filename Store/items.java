// it is a class of items that returns and set the information
public class items {
    public String itemName; // the name of the item
    public double price; 
    public int quantity;
    public double pound;

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

    public double pound()
    // retuns pound
    {
        return pound;
    }

    public void setItemName(String inItemName)
    // sets the item name
    {
        this.itemName = inItemName;
        setPriceBasedOnItemName();
    } 

    public void setPrice(double inPrice)
    // sets the price
    {
        this.price = inPrice;
    }

    public void setPriceBasedOnItemName()
    // sets the price on the listed items
    {
        if(this.itemName != null)
         {
            String itemNameLower = this.itemName.toLowerCase();
            if(this.itemName.equalsIgnoreCase("Rice"))
            {
                if(this.pound <= 5.0)
                {
                    this.price = 3;
                }
                else if( this.pound > 5.0)
                {
                    this.price = 4;
                }
            }
            
            else if(this.itemName.equalsIgnoreCase("Apple"))
            if(this.pound <= 5.0)
            {
                this.price = 6;
            }
            else if( this.pound > 5.0)
            {
                this.price = 8;
            }
            else if(this.itemName.equalsIgnoreCase("Tomato"))
            if(this.pound <= 5.0)
            {
                this.price = 8;
            }
            else if( this.pound > 5.0)
            {
                this.price = 10;
            }
            else if(this.itemName.equalsIgnoreCase("Soup"))
            if(this.pound <= 5.0)
                {
                    this.price = 9;
                }
                else if( this.pound > 5.0)
                {
                    this.price = 10;
                }
            else if(this.itemName.equalsIgnoreCase("Onion"))
            if(this.pound <= 5.0)
            {
                this.price = 3;
            }
            else if( this.pound > 5.0)
            {
                this.price = 4;
            }
            else
                this.price = 0.0;
         }
    }
    public void setQuantity(int inQuantity)
    // sets the quantity
    {
        this.quantity = inQuantity;
    }

    public void  setPound(int inPound)
    // sets the pound
    {
        pound = inPound;
    }

    // Constructors
    public items()
    {
        this.itemName = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    public items(String inItemName, double inPrice, int inQuantity, double inPound)
    {
        this.itemName = inItemName;
        this.price = inPrice;
        this.quantity = inQuantity;
        this.pound = inPound;
    }

    //  method to cacluate the total price
    public double calculateTotalPrice()
    {
        return price * quantity;
    }

// toString
public String toString()
{
    return  "Item: " +itemName + ", price: " + price + ", Quantity: " + quantity;
}

    
}
