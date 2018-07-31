import java.util.*;

public class ClockHands
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        while(true)
        {
            String time = key.nextLine();
            if (time.equals("0:00"))
                break;
            int h = Integer.parseInt(time.substring(0, time.indexOf(":")));
            int m = Integer.parseInt(time.substring(time.indexOf(":")+1, time.length()));
            double result = Math.abs(((60 * h + m)/2.0) - (m*6));
            System.out.printf("%.3f\n", Math.min(360-result, result));
        }
        key.close();
    }
}