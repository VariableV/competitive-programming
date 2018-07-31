import java.util.*;

public class SwallowingGround
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        int orig = 0;
        while(n-- > 0)
        {
            int cols = key.nextInt();
            int prev = Math.abs(key.nextInt() - key.nextInt());
            cols--;
            boolean trig = false;
            while(cols-- > 0)
                if (Math.abs(key.nextInt() - key.nextInt()) != prev)
                    trig=true;
            
            if (orig > 0)
                System.out.println();
            
            System.out.println((trig) ? "no" : "yes");
            orig++;
        }
        key.close();
    }
}