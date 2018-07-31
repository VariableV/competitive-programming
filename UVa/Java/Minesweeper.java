import java.util.*;

public class Minesweeper
{
    private static int[] rCells = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static int[] cCells = {-1, 0, 1, -1, 1, -1, 0, 1};

    private static boolean isCellAvailable(int[][] arr, int r, int c)
    {
        int n;
        try{
            n = arr[r][c];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return false;
        }
        return n > -1;
    }

    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int testCaseNum = 1;
        while(true)
        {
            int r = key.nextInt(), c = key.nextInt();
            if (r == 0 && c == 0)
                break;
            key.nextLine();
            int[][] arr = new int[r][c];
            // initialize array
            for (int y = 0; y < r; y++)
            {
                String line = key.nextLine();
                for (int x = 0; x < line.length(); x++)
                    if (line.charAt(x) == '*')
                        arr[y][x] = -1;
                    else
                        arr[y][x] = 0;
            }
            // manipulate array
            for (int y = 0; y < r; y++)
            {
                for (int x = 0; x < c; x++)
                {
                    if (arr[y][x] == -1)
                    {
                        for (int i = 0 ; i < 8; i++)
                        {
                            int nr = y+rCells[i], nc=x+cCells[i];
                            if (isCellAvailable(arr, nr, nc))
                                arr[nr][nc]++;
                        }
                    }
                }
            }
            
            // print out result
            if (testCaseNum > 1)
                System.out.println();
            System.out.printf("Field #%d:\n", testCaseNum++);
            for (int y = 0; y < r; y++)
            {
                for (int x = 0; x <  c; x++){
                    if (arr[y][x] == -1)
                        System.out.print('*');
                    else
                        System.out.print(arr[y][x]);   
                }
                System.out.println();
            }
        }
        key.close();
    }
}