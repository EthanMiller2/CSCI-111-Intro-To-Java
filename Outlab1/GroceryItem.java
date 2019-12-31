
/**
 * Write a description of class GroceryItem here.
 * 
 * @author Ethan Miller 
 * @version 9 Sept 2016
 */
public class GroceryItem
{
    // instance variables - replace the example below with your own
    private String name;
    private double cost;
    private int AisleNum;
    

    /**
     * Constructor for objects of class GroceryItem
     */
    public GroceryItem(String inName, double inCost, int inAisleNum)
    {
        name = inName;
        cost = inCost;
        AisleNum = inAisleNum;
    }

    public String getName()
    {
        return name;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public int getAisleNum()
    {
        return AisleNum;
    }
    
    public void changeCost(double newCost)
    {
     cost = newCost;
    }
    
}
