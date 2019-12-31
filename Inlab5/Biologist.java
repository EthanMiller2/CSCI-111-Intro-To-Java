
/**
 * Write a description of class Biologist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Biologist
{
    public static void identifyAnimal(Animal a)
    {
        if(a.getNumLegs() == 0)
        {
            System.out.println("No legs");
                if(a.getEnvironment() == "water")
                {
                    System.out.println("Lives in Water");
                    System.out.println("--->It's probably a fish");
                }
                else if(a.getEnvironment() == "land")
                {
                    System.out.println("Lives on Land");
                    System.out.println("---> Ahh! A snake");
                }
                else if(a.getEnvironment() == "air")
                {
                    System.out.println("Lives in the air");
                    System.out.println("--->I dont know, sounds fake");
                }
                else
                {
                    System.out.println("--->Never heard of it, must be fake");
                }
        }
        else if (a.getNumLegs() == 2)
        {
            System.out.println("Two Legs");
                if(a.getEnvironment() == "land")
                {
                   if(a.getSeemsNice())
                   {
                     System.out.println("Lives on Land");
                     System.out.println("--->Bro, thats your classmate!");
                   }
                   else 
                   {
                     System.out.println("Lives on Land");
                     System.out.println("--->Super rare, thats bigfoot! Snap a photo.");
                   }
                   }
                else if(a.getEnvironment() == "air")
                {
                     System.out.println("Lives in the air");
                     System.out.println("--->It's probably a bird");
                }
                else 
                {
                     System.out.println("--->Never heard of it, must be fake");
                }
        }            
        else if(a.getNumLegs() == 4)
        {
            System.out.println("Four Legs");
                if(a.getSeemsNice())
                {
                    System.out.println("Lives on Land");
                     System.out.println("--->It's probably a dog");
                }
                else if(!a.getSeemsNice()) 
                {
                     System.out.println("Lives on Land");
                     System.out.println("--->It's probably a skunk");
                }
                else
                {
                    System.out.println("--->Never heard of it, must be fake");
                }
                
        }
        else 
        {
            System.out.println("That's an odd number of legs, it's probably hurt or crawly");
        }
    }
    
    public static void petOrNot(Animal a)
    {
        if (a.getSeemsNice() && a.getNumLegs() == 4)
        {
           System.out.println("Go ahead and pet it");
        }
        else if (!a.getSeemsNice() || a.getNumLegs() == 0 )
        {
           System.out.println("Dont pet");
        }
        else
        {
           System.out.println("Pet at your own risk");
        }
      System.out.println();
    }
}
