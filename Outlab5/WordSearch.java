
/**
 * Write a description of class WordSearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class WordSearch
{
    // instance variables - replace the example below with your own
    private char[][] arr;
    private String word;
    public WordSearch(char[][] x)
    {
        arr = x;
    }

    public void play()
    {
        Scanner scan = new Scanner(System.in);
        boolean end = false;

        //While loop to read in user input
        while(!end)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[i].length; j++)
                {
                    System.out.print(arr[i][j] + " "); 
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("What word do you want to search for? (Type end to quit)");
            word = scan.nextLine();

            if(word.equals("end"))
            {
                end = true;
                break;
            }
            else
            {
                search();
            }
        }  
    }

    public void search()
    {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                if(word.charAt(0) == arr[row][col])
                {
                    boolean a = checkHorizontal(row, col);
                    boolean b = checkVertical(row, col);
                    boolean c = checkDiagonal(row, col);
                }
            }
        }
        if(!d)
        {
            System.out.println(word + "was not found!");
        }

    }

    public boolean checkHorizontal(int startRow, int startCol)
    {
        int row = startRow;
        int nextLet = 0;
        boolean found = false;

        while(nextLet < word.length())
        {
            for (int col = startCol; col < arr[row].length; col++)
            {
                if(arr[row][col] == word.charAt(nextLet))
                {
                    if(nextLet == word.length() - 1)
                    {
                        found = true;
                        System.out.println(word + " found horizontally at row " + startRow + " and column " + startCol + "!");
                        return found;
                    }
                    nextLet++;
                }
                else
                {
                    return found;
                }

            }
        }
        return found;
    }

    public boolean checkVertical(int startRow, int startCol)
    {
        int col = startCol;
        int nextLet = 0;
        boolean found = false;

        while(nextLet < word.length())
        {
            for (int row = startRow ; row < arr.length; row++)
            {
                if(arr[row][col] == word.charAt(nextLet))
                {
                    if(nextLet == word.length() - 1)
                    {
                        found = true;
                        System.out.println(word + " found vertically at row " + startRow + " and column " + startCol + "!");
                        return found;
                    }
                    nextLet++;
                }
                else
                {
                    return found;
                }
            }
        }
        return found;
    }

    public boolean checkDiagonal(int startRow, int startCol)
    {
        int spaceLeft = Math.min(arr.length - startRow, arr[0].length - startCol);
        int nextLet = 0;
        boolean found = false;

        while(nextLet < word.length())
        {
            for (int i = 0 ; i < spaceLeft; i++)
            {
                if(arr[startRow + i][startCol + i] == word.charAt(nextLet))
                {
                    if(nextLet == word.length() - 1)
                    {
                        found = true;
                        System.out.println(word + " found diagonally at row " + startRow + " and column " + startCol + "!");
                        return found;
                    }
                    nextLet++;
                }
                else
                {
                    return found;
                }
            }
        }
        return found;  
    }

}

