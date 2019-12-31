
/**
 * 
 * 
 * @author (Ethan Miller) 
 * @version (20 Sept 2016 )
 */
public class GroceryItem
{
    private String name;        //item name
    private double cost;        //cost of 1 unit of item
    private int stockNum;
    
    // constructor for GroceryItems
    public GroceryItem(String inName, double inCost, int inStockNum)
    {
        name = inName;
        cost = inCost;
        stockNum = inStockNum;
    }
    
    // returns the item's name
    public String getName()
    {
        return name;
    }
    
    // returns the cost of 1 item
    public double getCost()
    {
        return cost;
    }
    
    //prints the stock of the item
    public void printStock()
    {
        System.out.println("There are " + stockNum + " units of " + name + " in stock");
    }
}