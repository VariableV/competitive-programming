import java.util.*;

public class HorrorDash
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        for(int i = 0; i < n; i++)
        {
            int runners = key.nextInt();
            int minspeed = Integer.MIN_VALUE;
            while(runners-- > 0)
                minspeed = Math.max(minspeed, key.nextInt());
            System.out.printf("Case %d: %d\n", i+1, minspeed);
        }
        key.close();
    }
}