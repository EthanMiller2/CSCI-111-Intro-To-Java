
/**
 * Write a description of class BuildWS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class BuildWS
{
    private ArrayList<String> stringList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public void build()
    {

        System.out.println("How many rows would you like? >");
        int numRow = scan.nextInt();
        scan.nextLine();

        System.out.println("How many columns would you like? >");
        int numCol = scan.nextInt();
        scan.nextLine();

        char[][] arr = new char[numRow][numCol];

        fillRand(arr, numRow, numCol);
        print(arr);
        addWord();
        //addToArray(arr, 0, 0);
        //print(arr);

    }

    public void fillRand(char[][] x, int r, int c)
    {
        String str = "abcdefghijklmnopqrstuvwxyz";

        for (int row = 0; row < r; row++)
        {
            for(int col = 0; col < c; col++)
            {
                x[row][col] = str.charAt((int) (Math.random() * str.length()));                 
            }
        }
    }

    public void print(char[][] x)
    {
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x[i].length; j++)
            {
                System.out.print(x[i][j] + " "); 
            }
            System.out.println();
        }

    }

    public void addWord()
    {
        boolean end = false;
        while(!end)
        {
            System.out.print("Add a word to your search (end to stop) >");
            String s = scan.nextLine();

            if(s.equals("end"))
            {
                end = true;
                break;
            }
            else
            {
                stringList.add(s);
            }
        }
    }

//     public void addToArray(char[][] x, int startRow, int startCol)
//     {
//         int nextLet = 0;
//         int row = startRow;
//         for(String s : stringList)
//         {
//             int strlen = stringList.get(s).length();
//             for(int i = 0; i < strlen; i++)
//             {
//                 x[startRow][startCol] = words.get(i).charAt(s);
//             }
//         }
//         
//     }
}



