
/**
 * Write a description of class Fleet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fleet
{
    private Ship ship1;
    private Ship ship2;
    private Ship ship3;
    private Ship ship4;
    /**
     * Constructor for objects of class Fleet
     */
    public Fleet(Ship s1, Ship s2, Ship s3, Ship s4)
    {
        // initialise instance variables
        ship1 = s1;
        ship2 = s2;
        ship3 = s3;
        ship4 = s4;
    }
    
    //Deploy all the ships in the fleet
    public void deploy()
    {
        ship1.deployShip();
        ship2.deployShip();
        ship3.deployShip();
        ship4.deployShip();
    }
    
    //Refuel all the ships in the fleet
    public void reFuel()
    {
      ship1.refuelShip();
      ship2.refuelShip();
      ship3.refuelShip();
      ship4.refuelShip();
    }
    
    //Print out the fuel consumed for all ships in the fleet
    public void printSummary()
    {      
        System.out.println("Ship 1: " + ship1.getName() + " has consumed " + ship1.getFuelConsumed() + " fuel units.");     
        System.out.println("Ship 2: " + ship2.getName() + " has consumed " + ship2.getFuelConsumed() + " fuel units.");   
        System.out.println("Ship 3: " + ship3.getName() + " has consumed " + ship3.getFuelConsumed() + " fuel units.");     
        System.out.println("Ship 4: " + ship4.getName() + " has consumed " + ship4.getFuelConsumed() + " fuel units.");
        System.out.println();
    }
    
}

