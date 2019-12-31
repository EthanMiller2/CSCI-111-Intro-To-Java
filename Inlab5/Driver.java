
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
        Animal a1 = new Animal(0, "land", true);
        Biologist.identifyAnimal(a1);
        Biologist.petOrNot(a1);
        
        Animal a2 = new Animal(0, "air", true);
        Biologist.identifyAnimal(a2);
        Biologist.petOrNot(a2);
        
        Animal a3 = new Animal(0, "water", false);
        Biologist.identifyAnimal(a3);
        Biologist.petOrNot(a3);
        
        Animal a4 = new Animal(2, "land", true);
        Biologist.identifyAnimal(a4);
        Biologist.petOrNot(a4);
        
        Animal a5 = new Animal(2, "land", false);
        Biologist.identifyAnimal(a5);
        Biologist.petOrNot(a5);
        
        Animal a6 = new Animal(2, "air", true);
        Biologist.identifyAnimal(a6);
        Biologist.petOrNot(a6);
        
        Animal a7 = new Animal(4, "land", true);
        Biologist.identifyAnimal(a7);
        Biologist.petOrNot(a7);
        
        Animal a8 = new Animal(4, "land", false);
        Biologist.identifyAnimal(a8);
        Biologist.petOrNot(a8);
        
        Animal a9 = new Animal(100, "land", true);
        Biologist.identifyAnimal(a9);
        Biologist.petOrNot(a9);
        
        
       
        
      
    }
    
}

