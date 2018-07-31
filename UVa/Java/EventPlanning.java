import java.util.*;

public class EventPlanning
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(key.hasNextInt())
        {
            int participants = key.nextInt(), budget = key.nextInt(), hotels = key.nextInt(), weeks = key.nextInt();
            int finalprice = Integer.MAX_VALUE;
            for (int i = 0; i < hotels; i++)
            {
                int price = key.nextInt();
                int maxcap = Integer.MIN_VALUE;
                for (int o = 0; o < weeks; o++)
                    maxcap = Math.max(maxcap, key.nextInt());
                if (maxcap >= participants)
                    finalprice = Math.min(finalprice, price *  participants);
            }
            System.out.println((finalprice > budget) ? "stay home" : finalprice);
        }
        key.close();
    }
}