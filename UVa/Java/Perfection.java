import java.util.*;

public class Perfection
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.println("PERFECTION OUTPUT");
        while(true)
        {
            int n = key.nextInt();
            if (n == 0)
                break;
            int divsum = 0;
            boolean abundant = false;
            for(int i = 1; i < n; i++)
            {
                if (n%i == 0)
                    divsum += i;
                if (divsum>n)
                {
                    abundant = true;
                    break;
                }
            }
            System.out.printf("%5d  %s\n", n, (abundant) ? "ABUNDANT" : (divsum == n) ? "PERFECT" : "DEFICIENT");
        }
        System.out.println("END OF OUTPUT");
        key.close();
    }
}