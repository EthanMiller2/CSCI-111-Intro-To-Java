
/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array
{
    private int [] arr;

    public Array(int x)
    {
        arr = new int [x];
    }

    public void fill()
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (10 * Math.random());
        }

    }

    public void print()
    {
        for(int i = 0; i < arr.length * 2 + 1; i++)
        {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++)
        {
            if(i != arr.length - 1) 
            {
                System.out.print("|" + arr[i]);
            }
            else
            {
                System.out.print("|" + arr[i] + "|");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length * 2 + 1; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }

    public void sort()
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    } 
    
    public void printFrequency()
    {
        int slot = 0;
        for (int i = 0; i < 10; i++)
        {
            int total = 0;
            while (slot < arr.length && arr[slot] == i)
            {
                total++;
                slot++;
            }
            System.out.println("There are " + total + ", " + i + "'s");
        }
    }
}

    
    

