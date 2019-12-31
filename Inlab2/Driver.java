
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
      Book book1 = new Book("Dracula", 22, 7.55);
      System.out.println(book1.getTitle());
      System.out.println(book1.totalBookVal());
      
      Book book2 = new Book("Eragon", 34, 7.00);
      System.out.println();
      System.out.println(book2.getTitle());
      System.out.println(book2.totalBookVal());
      book2.bookSold();
      book2.bookSold();
      System.out.println();
      System.out.println("After 2 books sold the stock number for Dracula is: " + book2.getStockNum());
      book2.bookSold();
      System.out.println("After 3 books sold the stock number for Dracula is: " + book2.getStockNum());
      
  }
    
}
