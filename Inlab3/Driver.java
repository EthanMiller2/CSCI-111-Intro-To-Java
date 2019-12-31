
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main(String[] args)
    {
        // create grocery items
        GroceryItem item1 = new GroceryItem("milk", 3.39, 75);
        GroceryItem item2 = new GroceryItem("eggs", 1.75, 83);
        GroceryItem item3 = new GroceryItem("ice cream", 4.25, 37);
        
        // create new carts
        Cart shopper1 = new Cart("Gary");
        Cart shopper2 = new Cart("Sally");
        
        // add items to first cart
        shopper1.addItem1(item2, 1);        //1 "eggs" is being added
        shopper1.addItem2(item1, 5);        //5 "milk" are being added
        
        // add items to second ca
        shopper2.addItem1(item3, 2);        //2 "ice cream" are being added
        shopper2.addItem2(item2, 2);        //2 "eggs" are being added

        // print cart's receipt
        shopper1.printReceipt();
        shopper2.printReceipt();
        
        //print Stock Number for each item
        System.out.println();
        System.out.println("Store Inventory:");
        item1.printStock();
        item2.printStock();
        item3.printStock();
    }
}