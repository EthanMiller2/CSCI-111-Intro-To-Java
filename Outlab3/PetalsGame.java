
/**
 * Write a description of class PetalsGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PetalsGame
{
    // instance variables - replace the example below with your own
    private int dice1;
    private int dice2;
    private int dice3;
    private int dice4;
    private int dice5;
    private int petalNum;
    private int totalPetalNum;

    /**
     * Constructor for objects of class PetalsGame
     */
    public PetalsGame()
    {
       
    }
     
    public void rollDice()
    {
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
        dice3 = (int) (Math.random() * 6) + 1;
        dice4 = (int) (Math.random() * 6) + 1;
        dice5 = (int) (Math.random() * 6) + 1;
    }
    
    public void printDice()
    {
        System.out.println("You rolled the following: " + dice1 + ", " + dice2 + ", " + dice3 + ", " + dice4 + ", " + dice5);
    }
    
    public int calcPetals(int x)
    {
        if (x == 3)
        {
            petalNum = 2;
        }
        else if (x == 5)
        {
            petalNum = 4; 
        }
        else
        {
            petalNum = 0;
        }
        return petalNum;
    }
    
    public int calculateAllPetals()
    {
        totalPetalNum = calcPetals(dice1) + calcPetals(dice2) + calcPetals(dice3) + calcPetals(dice4) + calcPetals(dice5);
        return totalPetalNum;
    }

}
