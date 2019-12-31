
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String title;
    private int stockNum;
    private double cost;

    /**
     * Constructor for objects of class Book
     */
    public Book(String inTitle, int inStockNum, double inCost)
    {
        // initialise instance variables
        title = inTitle;
        stockNum = inStockNum;
        cost = inCost; 
    }

    public String getTitle()
    {
        // put your code here
        return title;
    }
    
    public int getStockNum()
    {
        return stockNum;
    }
    
    public double getCost()
    {
        return cost;  
    }
    
    public double totalBookVal()
    {
      return (double)(stockNum*cost);
    }
    
    public int bookSold()
    {
      stockNum = stockNum -1;
      return stockNum;  
    }
    
}
