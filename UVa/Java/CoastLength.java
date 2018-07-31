import java.util.*;
import java.io.*;

public class CoastLength
{
    static int counter = 0;
    static int[] rCells = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] cCells = {-1, 0, 1, -1, 1, -1, 0, 1};

    private static boolean isCellAvailable(int[][] arr, int r, int c)
    {
        int n;
        try
        {
            n = arr[r][c];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return false;
        }
        return n != 1;
    }

    private static void run(int[][] arr)
    {
        for (int y = 0; y < arr.length; y++)
        {
            for (int x = 0; x < arr[y].length; x++)
            {
                if (arr[y][x] == 1)
                {
                    for (int i = 0 ; i < 8; i++)
                    {
                        int nr = y+rCells[i], nc=x+cCells[i];
                        if (isCellAvailable(arr, nr, nc))
                            counter++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        Scanner key = new Scanner(new File("in.in"));
        int r = key.nextInt(), c = key.nextInt();
        int[][] arr = new int[r][c];
        key.nextLine();
        for (int i = 0; i < r; i++)
        {
            String str = key.nextLine();
            char[] ch = str.toCharArray();
            for (int o = 0; o < ch.length; o++)
                arr[i][o] = (int)ch[o] - 48;
        }

        run(arr);
        System.out.println(counter);
    }
}