import java.util.*;

public class TheSnail
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int h = key.nextInt();
        while (h != 0)
        {
            double u = key.nextInt(), d = key.nextInt(), f = key.nextInt();
            double day = 1, height = 0, constant = u * f / 100;
            while(true)
            {
                height += u;
                u = (u > 0) ? u-constant : u;
                if(height > h)
                {
                    System.out.printf("success on day %d\n", (int)day);
                    break;
                }
                height -= d;
                if (height < 0)
                {
                    System.out.printf("failure on day %d\n", (int)day);
                    break;
                }
                day++;
            }
            h = key.nextInt();
        }
        key.close();
    }
}