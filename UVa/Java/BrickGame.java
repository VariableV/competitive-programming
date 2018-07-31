import java.util.*;

public class BrickGame
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int t = key.nextInt();
        for(int i = 1; i <= t; i++)
        {
            int n = key.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            while(n-- > 0)
                arr.add(key.nextInt());
            Collections.sort(arr);
            System.out.printf("Case %d: %d\n", i, arr.get(arr.size()/2));
        }
        key.close();
    }
}