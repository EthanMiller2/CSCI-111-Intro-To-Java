
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private String name;
    private int atBats;
    private int hits;
    private double batAvg;
    private static int playerNum;

    /**
     * Constructor for objects of class Player
     */
    public Player(String inName)
    {
        // initialise instance variables
        name = inName;
        playerNum++;
    }
    
    //Adds number of at bats for a player
    public void addAtBats(int inAtBats)
    {
      atBats = inAtBats;  
    }
    
    //Adds the number of hits for a player
    public void addHits(int inHits)
    {
      hits = inHits;  
    }
     
    //Gets The name of a player
    public String getName()
    {
       return name; 
    }
    
    //Gets the at Bats of a player
    public int getAtBats()
    {
        return atBats;   
    }
    
    public int getHits()
    {
        return hits;
    }
    
    //Gets the number of players in the league
    public static int getPlayerNum()
    {
      return playerNum;  
    }
    
    //Calcuates the batting average of a player
    public double calcBatAvg()
    {
        batAvg =  (double) hits / atBats;
        return batAvg;
    }
    
}
