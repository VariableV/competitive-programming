import java.util.*;

class SnakeLadder
{
    String objectType;
    int start, end;

    public SnakeLadder(int start, int end)
    {
        this.start = start; this.end = end;
        if (end > start)
            objectType = "ladder";
        else
            objectType = "snake";
    }
}

public class SnakesAndLadders
{
    private static int find(ArrayList<SnakeLadder> arr, int pos)
    {
        for (SnakeLadder s : arr)
            if (s.start == pos)
                return s.end;
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        while(n-- > 0)
        {
            int players = key.nextInt(), snakes_ladders = key.nextInt(), diceRolls = key.nextInt();
            ArrayList<SnakeLadder> arr = new ArrayList<>();
            for (int i = 0; i < snake_ladders; i++)
                arr.add(new SnakeLadder(key.nextInt(), key.nextInt()));
            
        }
    }
}