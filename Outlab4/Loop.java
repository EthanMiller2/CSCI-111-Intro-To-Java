
/**
 * Write a description of class Loop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loop
{
    public Loop()
    {

    }

    public static void loop1(int lb, int ub, int incr)
    {
        System.out.println("Loop 1 output (lb = " + lb + ", ub = " + ub + ", incr = " + incr + ")");

        for(int i=lb; i<=ub; i+= incr)
        {
            System.out.println(i);
        }
        System.out.println("-----------");
    }

    public static void loop2(int lb, int ub, int incr)
    {
        System.out.println("Loop 2 output (lb = " + lb + ", ub = " + ub + ", incr = " + incr + ")");

        while(lb <= ub) 
        {
            System.out.println(lb);
            lb = lb + incr;
        }

        System.out.println("-----------"); 
    }

    public static void loop3()
    {
        System.out.println("Loop 3 output: ");
        String str = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i <=str.length(); i++)
        {
            String rem = str.substring(0,i);
            System.out.println(rem);
        }
        System.out.println("-----------"); 
    }

    public static void loop4(int val)
    {
        System.out.println("Loop 4 output: ");
        int count = 0;
        for(int i = 0; i <10; i++)
        {
            int rg = (int) (10 * Math.random()) + 1;
            if (rg == val)
            {
                count++;
            }
        }
        System.out.println(val + " was found " + count + " times."); 
        System.out.println("-----------"); 
    }

    public static void loop5(int val)
    {
        System.out.println("Loop 5 output: ");
        int count = 0; 
        int valcount = 0;

        while(valcount != 5)
        {
            int rg = (int) (10 * Math.random()) + 1;
            if (rg == val)
            {
                count++;
                valcount++;
            }
            else
            {
                count++;
            }
        }
        System.out.println("It took " + count + " times to generate " + val + " five times");
        System.out.println("-----------"); 
    }
    }


