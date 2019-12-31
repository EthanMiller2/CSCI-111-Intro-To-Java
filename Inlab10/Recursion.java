
/**
 * Write a description of class Recursion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
    public static void print(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if(i < array.length - 1)
            {
                System.out.print(array[i] + ",");
            }
            else
            {
                System.out.print(array[i] + "\n" );
            }
        }

    }

    public static int smallest(int[] array)
    {
        return smallestFrom(array, 0);
    }

    private static int smallestFrom(int[] array, int start)
    {
        if (start == array.length - 1)
        {
            return array[start];
        }
        else
        {
            return Math.min(array[start], smallestFrom(array, start + 1));
        }
    }

    public static int smallestIndex(int[] array)
    {
        return smallestIndexFrom(array, 0);
    }

    private static int smallestIndexFrom(int[] array, int start)
    {
        if(start == array.length - 1)
        {
            return start;
        }
        else
        {
            int index = smallestIndexFrom(array, start + 1);
            if(array[start] <array[index])
            {
                return start;
            }
            else
            {
                return index;
            }
        }
    }
}