
/**
 * Write a description of class Cart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cart
{
    // instance variables - replace the example below with your own
    private String name;
    private GroceryItem item1;
    private GroceryItem item2;
    private int item1Quant;
    private int item2Quant;
   
   
    

    /**
     * Constructor for objects of class Cart
     */
    public Cart(String inName)
    {
        name = inName;
    }
    
    //Return's the Shopers name
    public String getName()
    {
        return name;
    }
    
    //Adds item 1 to the cart
    public void addItem1(GroceryItem g1, int inQuantity)
    {
      item1 = g1;
      item1Quant = inQuantity;
    }
    
    //Adds item 2 to the cart
    public void addItem2(GroceryItem g2, int inQuantity)
    {
      item2 = g2; 
      item2Quant = inQuantity;
    }
 
    //Prints out the receipt for the Shopper
    public void printReceipt()
    {
        System.out.println("Shopper name: " + name);
        System.out.println("----------------------");
        System.out.println(item1.getName() + ": " + item1Quant + " units at $" + item1.getCost() + " per unit = $" + (item1.getCost() * item1Quant));
        System.out.println(item2.getName() + ": " + item2Quant + " units at $" + item2.getCost() + " per unit = $" + (item2.getCost() * item2Quant));
        System.out.println("       ----> Subtotal = $" + ((item1.getCost() * item1Quant) + (item2.getCost() * item2Quant)));
        System.out.println("       ----> 7% Tax = $" + (((item1.getCost() * item1Quant) + (item2.getCost() * item2Quant)) * 0.07));
        System.out.println("       ----> Total = $" + ((((item1.getCost() * item1Quant) + (item2.getCost() * item2Quant)) * 0.07) + ((item1.getCost() * item1Quant) + (item2.getCost() * item2Quant))));
        System.out.println();
       
    }
    
    
}
