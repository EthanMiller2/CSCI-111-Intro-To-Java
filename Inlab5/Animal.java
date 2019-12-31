
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{
    private int numLegs;
    private String environment;     //"land", "air", "water"
    private boolean seemsNice;
    
    public Animal(int inNumLegs, String inEnvironment, boolean inSeemsNice)
    {
        numLegs = inNumLegs;
        environment = inEnvironment;
        seemsNice = inSeemsNice;
    }
    
    public int getNumLegs()
    {
        return numLegs;
    }
    
    public String getEnvironment()
    {
        return environment;
    }
    
    public boolean getSeemsNice()
    {
        return seemsNice;
    }
    
    
}
