import java.util.*;

public class BeatTheSpread
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        while(n-- > 0)
        {
            int x = key.nextInt(), y =key.nextInt();
            if(x >= y && ((x+y)&1)==0)
            {
                int x1 = (x+y)/2;
                int x2 = x-x1;
                System.out.println(x1 + " " + x2);
            }
            else
                System.out.println("impossible");
        }
        key.close();
    }
}