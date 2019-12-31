
/**
 * Write a description of class ArrayLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayLab
{
    // instance variables - replace the example below with your own
    private int [] intarray;

    /**
     * Constructor for objects of class ArrayLab
     */
    public ArrayLab(int x)
    {
        intarray = new int [x]; 

    }

    public void initialize()
    {
        for (int i = 0; i < intarray.length; i++)
        {
            intarray[i] =(int) (11 * Math.random());
        }
    }

    public void print()
    {
        for (int i = 0; i < intarray.length; i++)
        {
            if (i != intarray.length - 1)
            {
                System.out.print(intarray[i] + ",");
            }
            else
            {
                System.out.print(intarray[i]);
            }
        }
        System.out.println("\n");
    }

    public void printStats()
    {
        int min = 0;
        int sum = 0;
        double avg = 0;
        int maxvalue = intarray[0];
        int minvalue = intarray[0];
        for (int i = 0; i < intarray.length; i++)
        {
            sum += intarray[i];
            avg = (double) sum / intarray.length;
            
            if(maxvalue < intarray[i])
            {
                maxvalue = intarray[i];
            }
            
            if (minvalue > intarray[i])
            {
                minvalue = intarray[i];
            }

        }
        System.out.println("Average: " + avg);
        System.out.println("Maximum value: " + minvalue);
        System.out.println("Minimum Value: " + maxvalue); 
    }
    
    public void search(int x)
    {
        boolean found = false;
        for (int i = 0; i < intarray.length; i++)
        {
            if ( intarray[i] == x)
            {
                found = true;
            }

        }
        
        if (found)
        {
            System.out.println(x + " was found.");
        }
        else
        {
            System.out.println(x + " was not found.");
        }
    }

}
