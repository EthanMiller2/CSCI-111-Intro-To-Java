
/**
 * Write a description of class Ship here.
 * 
 * @author (Ethan Miller) 
 * @version (16 Sept 2016)
 */
public class Ship
{
    // instance variables - replace the example below with your own
    private String shipName;
    private int fuelCapacity;
    private double fuelOnBoard;
    private double fuelConsumed;

    /**
     * Constructor for objects of class Ship
     */
    public Ship(String inName, int inFuel)
    {
       shipName = inName;
       fuelCapacity = inFuel;
       fuelOnBoard = inFuel;
    }
    
    //Get name of ship
    public String getName()
    {
        return shipName;    
    }
    
    //Get fuel capacity of ship 
    public int getFuelNum()
    {
        return fuelCapacity;   
    }
    
    //Get amount of fuel on board for ship
    public double getFuelOnBoard()
    {
       return fuelOnBoard; 
    }
    
    //Get fuel consumed for a ship
    public double getFuelConsumed()
    {
        return fuelConsumed;
    }
    
    //Deploy a ship
    public void deployShip()
    {
        fuelConsumed = (fuelConsumed + (fuelOnBoard / 2));
        fuelOnBoard = fuelOnBoard / 2;
        
    }
    
    //Refuel a ship 
    public void refuelShip()
    {
        fuelOnBoard = fuelCapacity;
    }
    
}

    
     

    
