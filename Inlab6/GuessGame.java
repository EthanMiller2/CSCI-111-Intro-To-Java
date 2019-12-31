
/**
 * Write a description of class GuessGame here.
 * 
 * @author (Ethan Miller) 
 * @version (10 Oct 2016)
 */
import java.util.Scanner;

public class GuessGame
{
    public static void example()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me a number:");
        int num = in.nextInt();
        System.out.println("You gave me " + num);
    }
    
    public static void play1()
    {
        int numGuesses = 0;
        Scanner in = new Scanner(System.in);
        int randnum = (int) (10 * Math.random()) + 1;
        boolean correctguess = false;
         
        System.out.println("VERSION 1:");
        System.out.println("I am thinking of a number between 1 and 10 :");
        while (!correctguess)
        {
            System.out.println("What is your guess? :");
            int guess = in.nextInt();
            System.out.println("You gave me: " + guess);
        
            if (guess > randnum)
            {
                System.out.println("Smaller!\n");
                numGuesses++;
            }
            else if (guess < randnum)
            {
                System.out.println("Bigger!\n");
                numGuesses++;
            }
            else
            {
                System.out.println("You guessed it!");
                correctguess = true;
                numGuesses++;
                System.out.println("You guessed: " + numGuesses + " times");
            }
        }
    }
    
    public static void play2()
    {
        Scanner scan = new Scanner(System.in);
        int randnum = (int) ((20) * Math.random()) + 5;
        boolean correctguess = false;
        int numGuesses = 0;
        
        System.out.println("VERSION 2:");
        System.out.println("I am thinking of a number between 5 and 25 :");
        
       for (int i = 1; i <= 5; i++)
       {
            
               System.out.println("What is guess #" + i);
               int guess = scan.nextInt();
               System.out.println("You gave me: " + guess);
               
               if (guess > randnum)
               {
                   System.out.println("Smaller!\n");
               }
               else if (guess < randnum)
               {
                   System.out.println("Bigger!\n");
               }   
               else
               {
                   System.out.println("You guessed it!");
                   break;
               }
               if(i == 5)
               {
                   System.out.println("That was your last try!");
               }
       }
    }
}

